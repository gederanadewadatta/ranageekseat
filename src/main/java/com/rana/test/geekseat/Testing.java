package com.rana.test.geekseat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import com.rana.test.geekseat.model.WitchData;

public class Testing {
	
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

	public static void main(String[] args) {
		// data initialize : start

		List<WitchData> listWitch = new ArrayList<WitchData>();
		List<String> listPerson = new ArrayList<String>();
//		listPerson.add("-1,12");
//		listPerson.add("13,17");
//		listPerson.add("10,12");
		listPerson.add("1,20");
		int temp = 0;
		int tempInvalidAge = 0;
		double avgKill = 0.0;
		for (int j = 0; j < listPerson.size(); j++) {
			if (!listPerson.get(j).isEmpty()) {
				String[] dataRequest = listPerson.get(j).split(",");
				int age = Integer.parseInt(dataRequest[0]);
				int year = Integer.parseInt(dataRequest[1]);
				int diff = year - age;
				System.out.println("Age:"+dataRequest[0]+"; Year of Death:"+dataRequest[1]+";Diff"+diff);
				if (age>0) {
					temp += fib(diff);
					System.out.println(temp);

				}
				else {
					tempInvalidAge++;
				}
			}
		}
		if (tempInvalidAge > 0) {
			System.out.println("return = -1 ");
		} else {
			avgKill = (double) temp / (double) listPerson.size();
			System.out.println((double)temp);
			System.out.println((double)listPerson.size());
			System.out.println("return =" + avgKill);
		}
	}

}
