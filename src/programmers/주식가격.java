package programmers;

public class 주식가격 {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		solution(prices);
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length-1; i++) {
        	int n = prices[i];
        	boolean drop = false;
        	for(int j = i+1; j < prices.length; j++) {
        		if(n > prices[j]) {
        			answer[i] = j-i;
        			drop = true;
        			break;
        		}
        	}
        	if(!drop) answer[i] = prices.length-i-1;
        }
        answer[prices.length-1] = 0;
        
        return answer;
    }
	
	public static int[] solution2(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i = 0; i < prices.length; i++) {
			for(int j = i+1; j < prices.length; j++) {
				answer[i]++;
				if(prices[i] > prices[j]) break;
			}
		}
		return answer;
	}
}
