package leetCode;

import java.util.ArrayList;

public class RemoveElement {
	final static int[] nums = {3,2,2,3};
	public static void main(String[] args) {
		int val = 3;
		System.out.println(removeElement(nums, val));

	}
	
    public static int removeElement(int[] nums, int val) {
    	ArrayList<Integer> numsList = new ArrayList<Integer>();
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] != val) {
    			numsList.add(nums[i]);
    		}
    	}
    	int[] newNums = new int[numsList.size()];
    	for(int i = 0; i < numsList.size(); i++) {
    		nums[i] = numsList.get(i);
    	}
    	return numsList.size();
    }
}
