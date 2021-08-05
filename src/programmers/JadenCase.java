package programmers;

public class JadenCase {

	public static void main(String[] args) {
		String s = "he  llo";
		
		
		System.out.println(solution3(s));
		

	}
	
	public static String solution(String s) {
		String answer = "";
		String[] str = s.toLowerCase().split("");
		for(int i = 0; i < str.length; i++) {
			if(i == 0 || str[i-1].equals(" ")) {
				answer += (str[i]).toUpperCase();
			} else {
				answer += str[i];
			}
		}
        return answer;
    }

	public String solution2(String s) {
	       String answer = "";
	        String[] sp = s.toLowerCase().split("");
	        boolean flag = true;

	        for(String ss : sp) {
	            answer += flag ? ss.toUpperCase() : ss;
	            flag = ss.equals(" ") ? true : false;
	        }

	        return answer;
	}
	public static String solution3(String s) {
		String answer = "";
		s = s.toLowerCase();
		boolean flag = true;
		for(int i = 0; i < s.length(); i++) {
			if(flag) answer += (s.charAt(i)+"").toUpperCase();
			else answer += s.charAt(i);
			
			if(s.charAt(i) == ' ') flag = true;
			else flag = false;
		}
        return answer;
    }
}
