package demo;

import java.util.Arrays;

public class Searching {

	static int count = 0;

	public static void linearsearch() {

		String[] str = new String[] { "rana", "shalviya", "rupal", "helo", "world", "shalviya" };

		char[] data = { 'r', 'a', 'n', 'a' };

		// String s5 = new String(data);

		String searchelem = "shalviya";

		for (int i = 0; i < str.length; i++) {
			if (Arrays.equals(str[i].toCharArray(), data)) {
				count++;
				// System.out.println("element present with count" + count);

			}
		}

		if (count != 0) {

			System.out.println("element present with count" + " " + count);
		}

		else {
			System.out.println("element not peresnt");
		}

	}

	public static void main(String[] args0) {

		// Searching search = new Searching();
Searching.linearsearch();

		String s = "";
		String sa = "";

		String s1 = new String("");

	}

}
