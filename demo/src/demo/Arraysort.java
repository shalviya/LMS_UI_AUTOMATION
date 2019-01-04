package demo;

import java.util.Scanner;

public class Arraysort {
	static int[] number = new int[5];

	public static void main(String[] args) {
		int i = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers");
	
		int num = sc.nextInt();
		while (num != 0) {
			
			int rem = num % 10;

			number[i] = rem;
			i--;
			num = num / 10;
		}
       for(i=0;i<number.length;i++)
		System.out.print(number[i]);
	}

	
	// public arraysort() {

	// }

}
