package programmers;

public class 괄호회전하기 {

	public static void main(String[] args) {
		String s = "[]{}()";
		solution(s);
	}
	
	public static int solution(String s) {
        int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			s = s.substring(1, s.length()) + s.charAt(0);
			if(check(s)) answer++;
		}
		
        return answer;
    }
	
	public static boolean check(String s) {
		while(s.contains("()") || s.contains("[]") || s.contains("{}")) {
				s = s.replace("()", "");
				s = s.replace("[]", "");
				s = s.replace("{}", "");
		}
		if(s.length() == 0) return true;
		else return false;
	}

}
