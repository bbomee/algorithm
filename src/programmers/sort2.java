package programmers;

import java.util.Arrays;

public class sort2 {
	public static void main(String[] args) {
		int[] numbers = {0,0};
		//90,908,89,898,10,101,1,8,9
		String a = "6610";
		String b = "6106";
		
		System.out.println(solution(numbers));
	}
	//연속한 수가 자리 수가 다를떄 더 큰 숫자의 마지막
    public static String solution(int[] numbers) {
    	String answer = "";
    	String[] nums = new String[numbers.length];
    	for(int i = 0; i < nums.length; i++) {
    		nums[i] = numbers[i] + "";
    	}
    	
    	Arrays.sort(nums);

    	for(int i = 0; i < numbers.length; i++) {
    		for(int j = 0; j < numbers.length-i-1; j++ ) {
    			if(Integer.parseInt(numbers[j]+""+numbers[j+1]) > Integer.parseInt(numbers[j+1]+""+numbers[j])) {
    				
    				int temp = numbers[j+1];
    				numbers[j+1] = numbers[j];
    				numbers[j] = temp;
    			}
    		}
    	}
    	for(int i = 0; i < numbers.length; i++) {
    		answer += numbers[numbers.length-i-1]+"";
    	}
    	if(Integer.parseInt(answer) == 0) return "0";
        return answer;
    }
}
