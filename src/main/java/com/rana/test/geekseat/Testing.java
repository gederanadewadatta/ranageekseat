package com.rana.test.geekseat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import com.rana.test.geekseat.model.WitchData;

public class Testing {
	private static int fib(int n) {

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

	public static void main(String[] args) {
		// data initialize : start
		int n = 10;
		List<WitchData> listWitch = new ArrayList<WitchData>();
		List<String> listPerson = new ArrayList<String>();
		listPerson.add("-1,12");
		listPerson.add("13,17");
		listPerson.add("12,17");
		WitchData data = new WitchData();
		int[] killData = new int[listPerson.size()];
		int dataPerson = listPerson.size();
		int temp = 0;
		int tempInvalidAge = 0;
		double avgKill = 0.0;
		// data initialize : stop
		for (int i = 0; i < n; i++) {

//			System.out.println("year:" + i + " village:" + fib(i));
			data.setAge(i);
			data.setKill(fib(i));

			listWitch.add(new WitchData(i, fib(i)));

		}

		for (int j = 0; j < listPerson.size(); j++) {
			if (!listPerson.get(j).isEmpty()) {
				String[] person = listPerson.get(j).split(",");
				int age = Integer.parseInt(person[0]);
				int year = Integer.parseInt(person[1]);
				int diff = year - age;
				if (!person[0].contains("0")) {
					int getKill = killVillagers(diff, listWitch);
//					System.out.println(getKill);
					temp += getKill; 
				}
				else {
					tempInvalidAge++;
				}
			}
		}
		if (tempInvalidAge > 0) {
			System.out.println("return = -1 ");
		} else {
			avgKill = (double) temp / (double) dataPerson;
			System.out.println((double)temp);
			System.out.println((double)dataPerson);
			System.out.println("return =" + avgKill);
		}
	}

	private static int killVillagers(int diff, List<WitchData> listWitch) {
		// TODO Auto-generated method stub
		int kill = 0;
		for (int index = 0; index < listWitch.size(); index++) {
//			System.out.println(listWitch.get(index).getAge());
			if (diff == listWitch.get(index).getAge()) {
//				System.out.println("equals");
				kill = listWitch.get(index).getKill();
//				System.out.println(kill);
			}
		}
		return kill;
	}

}
