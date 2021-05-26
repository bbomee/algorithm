package leetCode;

public class RotateString {

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "eabcd";
		
		System.out.println(rotateString(s, goal));
	}
	 public static boolean rotateString(String s, String goal) {
		 if(s.equals(goal)) return true;
		 //abcde
		 
		 for(int i = 0; i < s.length()-1; i++) {
			s = s.substring(1) + s.substring(0,1); 
			if(s.equals(goal)) {
				 return true;
			 } 
		 }
		 //i=0, bcdea   i=1, cdeab   i=2, deabc    i=3, eabcd    i=4, abcde
		 return false;
	 }

}
