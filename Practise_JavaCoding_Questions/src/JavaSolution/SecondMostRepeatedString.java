package JavaSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SecondMostRepeatedString {
	public static void main(String[] args) {
		String[] s = {"aaa", "bbb", "ccc", "bbb", "aaa",};
		//String[] s = { "ddd", "test", "ddd", "test", "ddd", "test" };

		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String s1 : s) {
			if (map.containsKey(s1)) {
				map.put(s1, map.get(s1) + 1);
			} else {
				map.put(s1, 1);
			}
		}
		
		
		System.out.println(map);

		Integer[] value = map.values().toArray(new Integer[0]);

		int biggest = 0;
		int secondBiggest = 0;

		for (int i = 0; i < value.length; i++) {
			if (i == 0) {
				biggest = value[i];
				secondBiggest = value[i + 1];
			} else {
				if (biggest < value[i]) {
					secondBiggest = biggest;
					biggest = value[i];
				} else if (secondBiggest < value[i]) {
					secondBiggest = value[i];
				}
			}

		}
		final int sec = secondBiggest;
		Map<String, Integer> finalMap = map.entrySet().stream().filter(x -> x.getValue() == sec)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		Map<String, Integer> finalMap1 = new HashMap<>();
		
		for(Map.Entry<String, Integer> map1 : map.entrySet()) {
			if(map1.getValue() == sec) {
				finalMap1.put(map1.getKey(), map1.getValue());
			}
		}
		/*
		 * Arrays.sort(value); // System.out.println(value[value.length-2]); Integer res
		 * = value[value.length - 2];
		 * 
		 * // List<String> map1 = value Iterator<Map.Entry<String, Integer>> itr =
		 * map.entrySet().iterator(); while (itr.hasNext()) { Map.Entry<String, Integer>
		 * entry = itr.next(); int v = entry.getValue(); if (v == res)
		 * System.out.println(entry.getKey()); }
		 */

		// System.out.println(finalMap);
System.out.println(finalMap1);
	}
}
