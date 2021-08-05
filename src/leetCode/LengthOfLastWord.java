package leetCode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}
    public static int lengthOfLastWord(String s) {
        String[] sArr = s.split(" ");
    	if(sArr.length == 0) {
    		return 0;
    	}
        return sArr[sArr.length-1].length();
    }
    
}
