package leetCode;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray2 {
	final static int[] nums = {1,1,1,2,2,3};
	public static void main(String[] args) {
		removeDuplicates(nums);
	}
	
    public static int removeDuplicates(int[] nums) {
        boolean overlap = false;
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        
		for(int i = 0; i < nums.length; i++) {
        	if(i == 0) { 
        		numsList.add(nums[i]);
        	} else { // i는 1부터 nums크기-1까지
        		if(nums[i] == nums[i-1]) { //중복값일때
        			if(!overlap) { //중복값이 한번도 안들어갔으면
        				numsList.add(nums[i]);
        				overlap = true; // 다음 중복값은 추가X
        			}
        		} else { //중복값이 아닐때
        			overlap = false;
        			numsList.add(nums[i]);
        		}
        	}
        }
		
		for(int i = 0; i < numsList.size(); i++) {
			nums[i] = numsList.get(i);
			System.out.println(nums[i]);
		}
		System.out.println("크기 : " + numsList.size());
		return numsList.size();
    }

}
