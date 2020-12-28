package leetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -123;
		System.out.println(reverse(x));
	}
	
	public static int reverse(int x) {
       try {
    	   boolean negative = false;
    	   if(x < 0) {
    		   negative = true;
    		   x = x * -1;
    	   }
    	   
    	   String sNum = Integer.toString(x);
    	   sNum = (new StringBuffer(sNum)).reverse().toString();
    	   int result = Integer.parseInt(sNum);
    	   
    	   if(negative) {
    		   result = result * -1;
    	   }
    	   
    	   return result;
       } catch(NumberFormatException e) {
    	   return 0;
       }
    }
    


}
