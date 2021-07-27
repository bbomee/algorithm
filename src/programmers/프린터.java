package programmers;

import java.util.ArrayList;
import java.util.List;

public class 프린터 {

	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 0;
		System.out.println(solution(priorities, location));
	}
	public static int solution(int[] priorities, int location) {    
		List<int[][]> print = new ArrayList<>();
		int[] result = new int[priorities.length];
		for(int i = 0; i < priorities.length; i++) {
			int[][] temp = {{i,priorities[i]}}; 
			print.add(temp);
		}

		int start = 0;
		while(print.size() > 0) {
			int[][] temp = print.get(0);
			print.remove(0);
			boolean isBigger = false;
			for(int i = 0; i < print.size(); i++) {
				if(temp[0][1] < print.get(i)[0][1]) {
					isBigger = true;
					break;
				}
			}
			if(isBigger) {
				print.add(temp);
			} else {
				result[start] = temp[0][0];
				start++;
			}
		}
		for(int i = 0; i < result.length; i++) {
			if(result[i] == location) return i+1;
		}
		
		return location;
	}

}
