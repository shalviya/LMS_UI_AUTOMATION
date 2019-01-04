package demo;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Reverse find = new Reverse();
		// find.reverseofnumber();
		int arr[] = new int[] { 2, 6, 8, 3, 6, 4 };
		find.reverseofarray(arr);

	}

	public void reverseofnumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input any number");
		
	
		int reverse = 0;
		int number = sc.nextInt();
		for (; number != 0;number = number / 10) {
			
			reverse = reverse * 10 +  number % 10;
			//number = number / 10;
		}
		System.out.println("reverse of input number is:" + reverse);
		sc.close();
	}

	public void reverseofarray(int[] inputarray) {

		for (int i = inputarray.length - 1; i >= 0; i--) {

			System.out.print("reverse array:"+inputarray[i]);

		}

	}

	public void sortarray(int[] arr) {

	}
}
