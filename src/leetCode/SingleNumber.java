package leetCode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
	}
	
    public static int singleNumber(int[] nums) {
    	for(int i = 0; i < nums.length; i++) {
    		int num = nums[i];
    		for(int j = 0; j < nums.length; j++) {
    			System.out.println(i + " " +j );
    			if(num == nums[j]) {
    				break;
    			} else if(j == nums.length-1) {
    				return nums[i];
    			}
    		}
    		
    	}
    	return 0;
    }                      

}
