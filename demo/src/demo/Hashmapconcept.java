package demo;

import java.util.HashMap;

public class Hashmapconcept {

	public static void main(String[] args) {

		HashMap<Comparable, String> map = new HashMap<Comparable, String>();
		map.put("name", "shalviya");
		map.put("name1", "rupal");
		map.put(1, "shalviya");

		System.out.println(map);

	}

}
