package programmers;

import java.util.ArrayList;
import java.util.List;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
	}
	public static int solution(String s){
		int answer = 0;
		List<String> str = new ArrayList<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(str.size() == 0) {
				str.add(s.charAt(i) + "");
			} else if(str.get(str.size()-1).equals(s.charAt(i)+"")) {
				str.remove(str.size()-1);
			} else {
				str.add(s.charAt(i) + "");
			}
		}
		if(str.size() == 0) answer = 1;

		return answer;
	}

}
