package leetCode;

import java.util.Arrays;

public class hIndex {
	public static void main(String[] args) {
		 int[] citations = {1, 7, 0, 1, 6, 4};
		 System.out.println(hIndex(citations));
	}
	
	public static int hIndex(int[] citations) {
		 int result = 0;
		 Arrays.sort(citations);
		 // 0 1 1 4 6 7
		 for(int i = 0; i < citations.length; i++) {
			 if(=) {
				 result = citations[i];
			 } 
		 }
		 return result;
	 }
}
