package leetCode;

import java.util.ArrayList;
import java.util.List;

public class nextPermutation {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		nextPermutation(nums);
	}
	 public static void nextPermutation(int[] nums) {
	        List<int[]> permList = new ArrayList<>();
	        perm(permList, nums, 0);
	        nums = permList.get(1);
	        
	        for(int i = 0; i < nums.length; i++) {
	        	System.out.print(nums[i] + " ");
	        }
	}
	 
	public static void perm(List<int[]> permList, int[] nums, int k) {
		if(k == nums.length) {
			int[] temp = new int[nums.length];
			for(int i = 0; i < nums.length; i++) {
				temp[i] = nums[i];
				//System.out.print(temp[i] + " ");
			}
			//System.out.println();
			permList.add(temp);
			return;
		}
		for(int i = k; i < nums.length; i++) {
			swap(nums, k, i);
			perm(permList, nums, k+1);
			swap(nums, k, i);
		}
	}
	
	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	

}
