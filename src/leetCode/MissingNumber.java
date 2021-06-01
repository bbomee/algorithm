package leetCode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		
	}
	public static int missingNumber(int[] nums) {
	    int resultSum = 0;
	    int arrSum = 0;
	    
		for(int i = 0; i < nums.length; i++) {
	    	 resultSum += i;
	    	 arrSum += nums[i];
	     }
		
		return resultSum + nums.length - arrSum;
    }

}
