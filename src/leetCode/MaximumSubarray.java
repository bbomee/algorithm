package leetCode;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] input = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(input));
	}
    public static int maxSubArray(int[] nums) {
    	int maxSum = nums[0];
    	for(int i = 0; i < nums.length; i++) {
    		int maxTemp = nums[i];
    		int temp = 0;
    		for(int j = i; j < nums.length; j++) {
    			temp = temp + nums[j];
    			if(maxTemp <= temp) {
    				maxTemp = temp;
    			}
    		}
    		if(maxSum <= maxTemp) {
    			maxSum = maxTemp;
    		}
    	}
    	return maxSum;
    }
}
