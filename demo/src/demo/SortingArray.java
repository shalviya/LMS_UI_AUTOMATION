package demo;

import java.util.Scanner;

class SortingArray {

	// Scanner input= new Scanner(System.in);

	public static void main(String[] args) {

		SortingArray obj = new SortingArray();
		obj.sortingarray();

	}

	public void sortingarray() {

		Scanner input = new Scanner(System.in);

		int[] arr = new int[10];
		System.out.println("input array elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			int in = input.nextInt();
			arr[i] = in;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Sorted arrays arev :-" + " ");
		for (int i = 0; i <= arr.length - 1; i++) {

			System.out.print(arr[i] + " ");

		}

	}

}