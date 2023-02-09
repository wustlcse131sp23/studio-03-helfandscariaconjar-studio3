package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n (inclusive) = ");
		int n = in.nextInt();
		boolean[] array = new boolean[n];
		for (int j = 0; j < array.length; j++) {
			if (j > 1) {
				array[j] = true;
			}
		}
		for (int i = 2; i < array.length/2; i++) {
			for (int k = i*2; k < array.length; k+=i)	{
				array[k] = false;
			}
			}
		for (int num = 0; num < array.length; num++) {
			if (array[num] == true) {
				System.out.println(num);
			}
		}
			}
	}


// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//