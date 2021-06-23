package boostcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex6 {

	public static void main(String[] args) {
		int[] arr = {3,5,7,9,1};
		Arrays.sort(arr);
		List<Integer> temp = new ArrayList<>();
		int count = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				count++;
				if(i == arr.length-1) {
					temp.add(count);
				}
			} else {
				if(count > 1) {
					temp.add(count);
				}
				count = 1;
			}
		}
		int[] result = new int[temp.size()];
		for(int i = 0; i < temp.size(); i++) {
			result[i] = temp.get(i);
			System.out.println(temp.get(i));
		}
		if(temp.size() == 0) {
			System.out.println("-1");
		}

	}

}
