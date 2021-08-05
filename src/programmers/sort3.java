package programmers;

import java.util.Arrays;

public class sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations = {1, 2, 3, 8, 8, 8, 8, 8, 8, 10 };
		solution(citations);
	}
	
    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        
        //1, 2, 3, 8, 8, 8, 8, 8, 8, 10 
        for(int i = 0; i < citations.length; i++) {
        	if(citations[i] <= citations.length-i) {
        		answer = citations[i];
        	}
        }
        System.out.println(answer);
        return answer;
    }

}
