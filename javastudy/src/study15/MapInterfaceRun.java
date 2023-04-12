package study15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterfaceRun {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>() {
			@Override
			public String toString() {
				
				return "안녕!!";
			}
		};
		hmap.put(103, "Lee");
		hmap.put(102, "Kim");
		hmap.put(101, "Kim");
		hmap.put(102, "Hong");
		System.out.println(hmap.size());
		System.out.println(hmap);
		
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(103, "Lee");
		lmap.put(102, "Kim");
		lmap.put(101, "Kim");
		lmap.put(102, "Hong");
		System.out.println(lmap.size());
		System.out.println(lmap.toString());
		
		
		Hashtable<Integer, String> htmap = new Hashtable<>();
		htmap.put(103, "Lee");
		htmap.put(102, "Kim");
		htmap.put(101, "Kim");
		htmap.put(102, "Hong");
		System.out.println(htmap.size());
		System.out.println(htmap.toString());
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(103, "Lee");
		tmap.put(102, "Kim");
		tmap.put(101, "Kim");
		tmap.put(102, "Hong");
		System.out.println(tmap.size());
		System.out.println(tmap.toString());
		
		
		
	}
}
