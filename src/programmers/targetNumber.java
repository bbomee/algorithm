package programmers;

import java.util.ArrayList;
import java.util.List;

public class targetNumber {

	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		System.out.println(solution(numbers, 3));
	}
	 public static int solution(int[] numbers, int target) {
	        List<Integer> a = new ArrayList<>();
	        int answer = 0;
	        //targetNumber(numbers, target, a , 0, 0); 
	        //return a.size();
	        answer = targetNumber(numbers, target, 0,0);
	        return answer;
	 }
	 
	/* public static void targetNumber(int[] numbers, int target, List<Integer> a, int k, int temp) {
		 if(k == numbers.length) {
			 if(temp == target) a.add(1);
			 return;
		 } 
			 targetNumber(numbers, target, a, k+1, temp-numbers[k]);
			 targetNumber(numbers,target, a, k+1, temp+numbers[k]);
			
	 }*/
	 
	 public static int targetNumber(int[] numbers, int target, int k, int sum) {
		 if(k == numbers.length) {
			 if(sum == target) {
				 return 1;
			 }
			return 0;
			 
		 }
		 
		 return targetNumber(numbers, target, k+1, sum+numbers[k]) + targetNumber(numbers, target, k+1, sum-numbers[k]);
		 
	 }
	 
	 

}
