package algorithm;

import java.util.ArrayList;
import java.util.List;

public class permutation {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<int[]> numsList = new ArrayList<>();
		perm(nums, 0, numsList);
		for(int i = 0; i < numsList.size(); i++) {
			int[] temp = numsList.get(i);
			for(int j = 0; j < temp.length; j++) {
				System.out.print(temp[j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void perm(int[] nums, int k, List<int[]> numsList) {
		if(k == nums.length) {
			int[] temp = new int[nums.length];
			for(int i = 0 ; i < nums.length; i++) {
				temp[i] = nums[i];
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			numsList.add(temp);
			return;
		}  else {
			for(int i = k; i < nums.length; i++) {
				swap(nums, k, i);
				perm(nums, k+1, numsList);
				swap(nums, k, i);
			}
		}
		
	}
	
	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
