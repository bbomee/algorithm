package leetCode;

import java.util.ArrayList;
import java.util.List;

public class kakao2020_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbaccc";
		solution(s);
	}
	public static int solution(String s) {
		int answer = 0;
		List<List<String>> result = new ArrayList<>();

		for(int i = 1; i <= s.length()/2; i++) {
			List<String> list = new ArrayList<>();
			int same = 1;
			String temp = "";
			String nextTemp = "";
			for(int t = 0; t < s.length(); i++) {
				for(int j = 0; j < i; j++) {
					temp += s.charAt(j+t);
					nextTemp += s.charAt(i+t+j);
				}
				if(temp == nextTemp) {
					same++;
					t += i;
				} else {
					list.add(Integer.toString(same));
					for(int k = 0; k < i; k++) {
						list.add(temp + "");
					}
					same = 1;
				}
			}


		}
		for(int i = 0; i < s.length(); i++) {
			for(int j = 1; j <= s.length()/2; j++) {
				int same = 1;
				List<String> list = new ArrayList<>();
				for(int k = 0; k < j; k++) {
					if(s.charAt(i) == s.charAt(i+1)) {
						same++;
					}
				}
			}
		}
		return answer;
	}
}
