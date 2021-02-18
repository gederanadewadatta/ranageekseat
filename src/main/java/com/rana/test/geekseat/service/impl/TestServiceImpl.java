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
	private List<VillagerData> listVillagerData = new ArrayList<VillagerData>();
	private List<WitchData> listWitchData = new ArrayList<WitchData>();

	@Override
	public String findKillPeople(VillagerData person) {
		// TODO Auto-generated method stub

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
			data.setKill(fibonacci(i));

			listWitchData.add(new WitchData(i, fibonacci(i)));

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

		result = "return =" + avgKill;
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

	private static int fibonacci(int n) {

		if (n <= 0)
			return 0;

		int fibo[] = new int[n + 1];
		fibo[0] = 0;
		fibo[1] = 1;

		// Initialize result
		int sum = fibo[0] + fibo[1];

		// Add remaining terms
		for (int i = 2; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			sum += fibo[i];
		}

		return sum;
	}

}
