package boostcamp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class notSortEx6 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,3,4,4};
		Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
		Iterator<Integer> keys = linkedHashMap.keySet().iterator();
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(linkedHashMap.containsKey(arr[i])) {
				if(linkedHashMap.get(arr[i]) == 1) { count++; }
				linkedHashMap.replace(arr[i], linkedHashMap.get(arr[i])+1);
			} else {
				linkedHashMap.put(arr[i],1);
			}
		}
		
		if(count == 0) {
			System.out.println("-1");
		} else {
			int resSize = 0;
			int[] result = new int[count];
			for(int key : linkedHashMap.keySet()) {
				int value = linkedHashMap.get(key);
				if(value != 1) {
					result[resSize++] = value;
				}
			}
			for(int i = 0; i < count; i++) {
				System.out.println(result[i]);
			}
		}
		
		
		
		
	}

}
