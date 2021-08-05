package programmers;

import java.util.ArrayList;
import java.util.List;

public class 최솟값 {

	public static void main(String[] args) {
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int []A, int []B) {
        int answer = 0;
        List<int[]> pumA = new ArrayList<>();
        perm(A,0, pumA);
        
        for(int i = 0; i < pumA.size(); i++) {
        	int[] temp = pumA.get(i);
        	int sum = 0;
        	for(int j = 0; j < temp.length; j++) {
        		sum += temp[j]*B[j];
        	}
        	if(i == 0) answer = sum;
        	else if(answer > sum) answer = sum;
        }
        return answer;
    }
	
	public static void perm(int[] A, int num, List<int[]> pumA) {
		if(num == A.length) {
			int[] temp = new int[A.length];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = A[i];
			}
			pumA.add(temp);
		} else {
			for(int i = num; i < A.length; i++) {
				swap(A, num, i);
				perm(A, num+1, pumA);
				swap(A, num, i);
			}
		}
	}
	
	public static void swap(int[] nums,int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
