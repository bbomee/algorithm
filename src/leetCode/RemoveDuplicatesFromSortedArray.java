package leetCode;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

	final static int[] nums = {0,0,1,1,1,2,2,3,3,4};
	public static void main(String[] args) {
		int size = removeDuplicates(nums);
		for(int i = 0; i < size; i++) {
			System.out.println(nums[i]);
		}
		
	}
    
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> numsList = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
        	if(i == 0) {
        		numsList.add(nums[i]);
        	} else {
        		if(nums[i] != nums[i-1]) {
        			numsList.add(nums[i]);
        		}
        	}
        }
		
		for(int i = 0; i < numsList.size(); i++) {
			nums[i] = numsList.get(i);
		}
		return numsList.size();
    }
}
