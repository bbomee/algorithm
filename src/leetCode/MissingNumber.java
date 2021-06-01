package leetCode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		
	}
	public static int missingNumber(int[] nums) {
        int numLen = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i < numLen; i++) {
        	if(i != nums[i]) {
        		return i;
        	}
        }
        
		return 0;
    }

}
