package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums = {0};
		List<List<Integer>> answer = new ArrayList<>();
		answer = subsets(nums);
		System.out.println(answer.size());
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        int N = nums.length;
		boolean[] include = new boolean[N];
        List<List<Integer>> result = new ArrayList<>();
        powerSet(result, nums, include, 0, N);
        return result;
    }
	
	public static void powerSet(List<List<Integer>> result, int[] nums, boolean[] include, int k, int N) {
		if(k == N) {
			List<Integer> answer = new ArrayList<>();
			for(int i = 0; i < N; i++) {
				if(include[i]) {
					answer.add(nums[i]);
				}
			}
			result.add(answer);
			return ;
		}
		include[k] = false;
		powerSet(result, nums, include, k+1, N);
		include[k] = true;
		powerSet(result, nums, include, k+1, N);
	}

}
