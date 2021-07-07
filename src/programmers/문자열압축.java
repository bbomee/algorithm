package programmers;

import java.util.*;

public class 문자열압축 {

	public static void main(String[] args) {
		String s = "abcabcabcabcdededededede";
		System.out.println(solution(s));
	}
	public static int solution(String s) {
		String answer = s;
		for(int i = 1; i <= s.length()/2; i++) {
			int cnt = 1;
			String ans = "";
			String str = "";
			int j = 0;
			while(j+i <= s.length()) {
				String subStr = s.substring(j,j+i);
				if(j == 0) {
					str = subStr; 
				}else if(str.equals(subStr)) {
					cnt++;
					if(j+i > s.length()-i) {
						ans += cnt+str;
					}
				} else {
					if(cnt == 1) {
						ans += str;
					} else {
						ans += cnt+str;
						cnt = 1;
					}
					str = subStr;
					if(j+i > s.length()-i) {
						ans += str;
					}
				}
				j += i;
			}
			ans += s.substring(s.length() - s.length()%i);
			if(answer.length() > ans.length()) answer = ans;
			
		}
		return answer.length();
	}
	

}
