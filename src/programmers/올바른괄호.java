package programmers;

import java.util.ArrayList;
import java.util.List;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "(())()((";
		System.out.println(solution2(s));
	}
	
	public static boolean solution(String s) {
		while(s.contains("()")) {
			s = s.replace("()", "");
		}
		if(s.length() == 0) return true;
		return false;
    }
	
	public static boolean solution2(String s) {
		List<Character> temp = new ArrayList<>();
		int cnt = 0;
		char[] str = s.toCharArray();
		for(int i = 0; i < str.length; i++) {
			if(str[i] == '(') {
				cnt++;
			} else {
				if(cnt == 0) {
					return false;
				} else {
					cnt--;
				}
			}
			
		}
		if(cnt == 0) return true;
		return false;
	}
}
