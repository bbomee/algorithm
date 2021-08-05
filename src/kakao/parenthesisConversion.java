package kakao;

import java.util.ArrayList;
import java.util.List;

public class parenthesisConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "())((())))((()";
		System.out.print(parenthesisConversion(p));
	}
	
	public static String parenthesisConversion(String p) {
		String answer = "";
		List<String> sl = new ArrayList<>();
		int max = p.length()/2;
		
		for(int i = 0; i < p.length()/2; i++) {
			if(p.charAt(i) == ')' && sl.size() == 0) {
				answer += '(' + "";
				sl.add('(' + "");
				max -= 1;
			} else {
				if(p.charAt(i) == '(') {
					max -= 1;
				}
				answer += p.charAt(i) + "";
				sl.add(p.charAt(i) + "");
			}

			if(sl.size() >= 2) {
				if(sl.get(sl.size()-2).equals("(") && sl.get(sl.size()-1).equals(")")) {
					sl.remove(sl.size()-1);
					sl.remove(sl.size()-1);
				}
			}
			System.out.println(max);
		}
		
		for(int i = p.length()/2; i < p.length(); i++) {
			if(p.charAt(i) == '(' && sl.size() <= max) {
				answer += '(' + "";
				sl.add('(' + "");
				max -= 1;
			} else if( sl.size() == 0) {
				answer += '(' + "";
				sl.add('(' + "");
				max -= 1;
			}	else {
				answer += ')' + "";
				sl.add(')' + "");
			}
			
			if(sl.size() >= 2) {
				if(sl.get(sl.size()-2).equals("(") && sl.get(sl.size()-1).equals(")")) {
					sl.remove(sl.size()-1);
					sl.remove(sl.size()-1);
				}
			}
		}
		
		
		return answer;
	}

}
