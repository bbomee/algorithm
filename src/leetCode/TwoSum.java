package leetCode;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello leetCode~!");
		
		int[] test = {3, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(test, target);
	}
	
	
    public static int[] twoSum(int[] nums, int target) {
        //nums 배열에 몇번쨰랑 몇번째를 더해야 target 값이 나오느냐!!
        
        for(int i = 0; i <nums.length; i++) {
            for(int j = i+1 ; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    int[] Output = {i,j};
                    return Output;
                }
            }
        }
        return null;
    }
}
