package programmers;

import java.util.HashSet;

public class 소수만들기 {

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
        int[] answer = {0};
        	for(int j = 0; j < nums.length; j++) {
        		int[] sum = new int[1];
        		sum[0] += nums[j];
        		sumNum(nums, j+1, 1, sum, answer);
        		sum[0] -= nums[j];
        	}
        
        return answer[0];
    }
	
	public static boolean isSosu(int num) {
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0)  {
				return false;
			}
		}
		return true;
	}
	
	public static void sumNum(int[] nums, int idx, int k, int[] sum, int[] answer) {
		if(k == 3) {
			if(isSosu(sum[0])) answer[0]++;
			return;
		}
		
		for(int i = idx; i < nums.length; i++) {
			sum[0] += nums[i];
			sumNum(nums, i+1, k+1, sum, answer);
			sum[0] -= nums[i];
		}
	}
}
