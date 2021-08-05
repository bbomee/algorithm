package programmers;

public class 괄호회전하기 {

	public static void main(String[] args) {
		String s = "[]{}()";
		String a = "헉안녕하세요";
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			s = s.substring(1, s.length()) + s.charAt(0);
			if(check(s)) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	public int solution(String s) {
        int answer = -1;
        
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
