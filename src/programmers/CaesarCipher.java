package programmers;

public class CaesarCipher {

	public static void main(String[] args) {
		String s = "a B z";
		System.out.println(solution(s, 4));
	}
	public static String solution(String s, int n) {
        String answer = "";
     
        for(int i = 0; i < s.length(); i++) {
        	int plusChNum = (int)s.charAt(i) + n;
        	if(s.charAt(i) == ' ') {
        		answer += " ";
        	} else if(plusChNum > (int)'z') {
        		answer += (char)((int)'a' + plusChNum - (int)'z' - 1);
        	} else if((int)s.charAt(i) <= (int)'Z' && plusChNum > (int)'Z') {
        		answer += (char)((int)'A' + plusChNum - (int)'Z' - 1);
        	} else {
        		answer += (char)((int)s.charAt(i) + n);
        	}
        }
        return answer;
    }

}
