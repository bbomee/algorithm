package naverWebtoon;

import java.util.Arrays;
import java.util.Collections;

public class bbotest1 {

	public static void main(String[] args) {
		int[] prices = {32000, 18000, 42500, 100, 100};
		int[] discounts = {50, 20, 65};
		System.out.println(solution(prices, discounts));
	}
	
	public static int solution(int[] prices, int[] discounts) {
		Arrays.sort(prices);
		Arrays.sort(discounts);
		
		int answer = 0;
		int len = prices.length - discounts.length;
		for(int i = prices.length-1; i >= 0; i--) {
			if(i-len >= 0) {
				answer += prices[i] * (100-discounts[i-len])/100;
			} else {
				answer += prices[i];
			}
		}
		return answer;
	}

}
