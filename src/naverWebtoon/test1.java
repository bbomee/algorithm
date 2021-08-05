package naverWebtoon;

import java.util.*;

public class test1 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      
	      int prices[] = {13000, 88000, 10000};
	      int discounts[] = {30, 20};
	      
	      int result = solve(prices, discounts);
	   }

	   
	   static int solve(int[] prices, int[] discounts) {
	      int result = 0;
	      
	      Integer[] pricesWrap = new Integer[prices.length];
	      Integer[] discountsWrap = new Integer[discounts.length];
	      
	      for(int i = 0; i<prices.length; i++) {
	         pricesWrap[i] = prices[i];
	      }
	      
	      for(int i = 0; i<discounts.length; i++) {
	         discountsWrap[i] = discounts[i];
	      }
	      
	      Arrays.sort(pricesWrap, Collections.reverseOrder());
	      Arrays.sort(discountsWrap, Collections.reverseOrder());
	      
	      for(int i = 0; i < pricesWrap.length; i++) {
	         if(i < discountsWrap.length) {
	            int discountPrice = (int) (pricesWrap[i] * (discountsWrap[i] * 0.01));
	            result += pricesWrap[i] - discountPrice;
	         } else {
	            result += pricesWrap[i];
	         }
	      }
	      
	      System.out.println(result);
	      return result;
	   }


}
