package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 숫자게임 {

	public static void main(String[] args) {
		int[] A = {2, 3, 4, 5, 6, 7};
		int[] B = {3, 4, 5, 6, 7, 2};
		System.out.println(solution(A,B));
	}
	
	public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int bIdx = 0;
        for(int i = 0; i < A.length; i++) {
        	for(int j = bIdx; j < B.length; j++) {
        		if(A[i] < B[j]) {
        			answer++;
        			bIdx = j+1;
        			break;
        		}
        	}
        }
        return answer;
    }

}
