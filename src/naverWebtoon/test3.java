package naverWebtoon;

public class test3 {

	 public static void main(String[] args) {
	      String s = "abaaaaabbbbb";
	      String t = "ab";
	      
	      int result = solve(s, t);
	   }

	   
	   static int solve(String s, String t) {
	      int result = 0;
	      
	      while(s.contains(t)) {
	         System.out.println(s + " " + t);
	         s = s.replaceFirst(t, "");
	         result++;
	      }      
	            
	      System.out.println("결과 : " + result);
	      return result;
	   }


}
