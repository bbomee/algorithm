package programmers;

import java.util.*;

public class hash3 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		HashMap<String, Integer> map = new HashMap<>(); 
		
		for(int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) +1);
			/*if(!map.containsKey(clothes[i][1])) {
				map.put(clothes[i][1], 1);
			} else {
				map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
			}*/
		}
		
		int result = 1;
		for(int val: map.values()) {
			result *= (val+1);
		}
		
		System.out.println(result-1);
		
		/*
		 * map의 모든 값 확인
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			int value = map.get(key);
			System.out.println(key + " " + value);
		}
		
		for(String key: map.keySet()) {
			int val = map.get(key);
			System.out.println(key + " " + val);
		}
		*/
		
	}

}
