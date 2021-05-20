/**
 * 
 */
package com.rana.test.geekseat.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rana.test.geekseat.model.*; 
import com.rana.test.geekseat.service.TestService;

/**
 * @author ranadewadatta
 *
 */
@Service
public class TestServiceImpl implements TestService { 
	 
private List<WitchData> listWitchData = new ArrayList<WitchData>();

	@Override
	public String findKillPeople(VillagerData person) {
		// TODO Auto-generated method stub
		List<VillagerData> listVillagerData = new ArrayList<VillagerData>();

		// without database :start
		listVillagerData.add(person);

		String result = doProcess(listVillagerData);

		// without database :stop

		return result;
	}

	private String doProcess(List<VillagerData> dataVillager) {
		// TODO Auto-generated method stub
		String result = null;
		WitchData data = new WitchData();
		List<VillagerData> dataPersonList = dataVillager;
		int dataPerson = dataPersonList.size();
		int temp = 0;
		double avgKill = 0.0;
		// data initialize : stop
		for (int i = 0; i < 10; i++) {

			data.setAge(i);
			data.setKill(fib(i));

			listWitchData.add(new WitchData(i, fib(i)));

		}

		for (int j = 0; j < dataPerson; j++) {
			if (!dataPersonList.get(j).equals(null)) {
//				String[] person = dataPersonList.get(j).;
				int age = dataPersonList.get(j).getAgedeath();
				int year = dataPersonList.get(j).getYeardeath();
				int diff = year - age;
				if (age > 0) {
					int getKill = killVillagers(diff, listWitchData);
					temp += getKill;
					System.out.println(temp);

				}
			}
		}

		avgKill = (double) temp / (double) dataPerson;
		System.out.println("villagers kill:"+(double)temp);
		System.out.println("villagers data:"+(double)dataPerson);

		result = "" + avgKill;
		System.out.println("return =" + avgKill);
		return result;
	}

	private static int killVillagers(int diff, List<WitchData> listWitch) {
		// TODO Auto-generated method stub
		int kill = 0;
		for (int index = 0; index < listWitch.size(); index++) {
			if (diff == listWitch.get(index).getAge()) {
				kill = listWitch.get(index).getKill();
				System.out.println("villager killed:"+kill);
			}
		}
		return kill;
	}
 	private static int fib(int n)
	{

		int[][] F = {{1, 1},

				{1, 0}};

		if (n == 0)

			return 0;

		power(F, n - 1);

		return F[0][0];
	}

	private static int getMSB(int n){
		// consectutively set

		// all the bits

		n |= n >> 1;

		n |= n >> 2;

		n |= n >> 4;

		n |= n >> 8;

		n |= n >> 16;


		// returns the

		// second MSB

		return ((n + 1) >> 2);
	}
	private static void multiply(int F[][],

						 int M[][])
	{

		int x = F[0][0] * M[0][0] +

				F[0][1] * M[1][0];

		int y = F[0][0] * M[0][1] +

				F[0][1] * M[1][1];

		int z = F[1][0] * M[0][0] +

				F[1][1] * M[1][0];

		int w = F[1][0] * M[0][1] +

				F[1][1] * M[1][1];


		F[0][0] = x;

		F[0][1] = y;

		F[1][0] = z;

		F[1][1] = w;
	}
	private static void power(int F[][],

							  int n)
	{

		// Base case

		if (n == 0 || n == 1)

			return;


		// take 2D array to

		// store number's

		int[][] M ={{1, 1},

				{1, 0}};


		// run loop till MSB > 0

		for (int m = getMSB(n);

			 m > 0; m = m >> 1)

		{

			multiply(F, F);


			if ((n & m) > 0)

			{

				multiply(F, M);

			}

		}
	}

}
