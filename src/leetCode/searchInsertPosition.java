package leetCode;

public class searchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 7};
		int target = 5;
		
		System.out.println(searchInsert(nums, target));
	}
	public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == target) {
        		return i;
        	} else if(i !=0 && nums[i] > target){
        		return i;
        	} else if(i == 0 && nums[i] > target) {
        		return 0;
        	}
        }
        return nums.length;
    }

}
