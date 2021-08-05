package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 땅따먹기 {

	public static void main(String[] args) {
		int[][] land = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
		System.out.println(solution(land));

	}
	public static int solution(int[][] land) {
        int sum = 0;
        int[] answer = {0};
        for(int i = 0; i < land[0].length; i++) {
				sum += land[0][i];
				sumLand(1, i, sum, answer, land);
				sum -= land[0][i];
		}
        return answer[0];
    }
	
	public static int solution2(int[][] land) {
		return 0;
	}
	
	public static void sumLand(int r, int lastC, int sum, int[] answer, int[][] land) {
		if(r == land.length) {
			if(answer[0] < sum) answer[0] = sum;
			return;
		} else {
			for(int i = 0; i < land[0].length; i++) {
				if(i != lastC) {
					sum += land[r][i];
					sumLand(r+1, i, sum, answer, land);
					sum -= land[r][i];
				}
			}
		}
	}
}
