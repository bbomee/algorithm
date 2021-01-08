package leetCode;

import java.util.ArrayList;

import com.sun.java_cup.internal.runtime.Symbol;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "({})([][]{})";
		if(isValid(s)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
	
	public static boolean isValid(String s) {
		ArrayList<String> list = new ArrayList();
		for(int i = 0 ; i < s.length(); i++) {
			list.add(Character.toString(s.charAt(i)));
		}

		for(int i = 0 ; i < s.length()/2; i++) {
			int start = 0;
			for(int j = start; j < list.size()-1; j++) {
				if(list.get(j).charAt(0) == '(' && list.get(j+1).charAt(0) == ')') {
					list.remove(j);
					list.remove(j);
				} else if(list.get(j).charAt(0) == '[' && list.get(j+1).charAt(0) == ']') {
					list.remove(j);
					list.remove(j);	
				} else if(list.get(j).charAt(0) == '{' && list.get(j+1).charAt(0) == '}') {
					list.remove(j);
					list.remove(j);	
				}
			}
		}
		if(list.size() > 0) {
			return false;
		}
		return true;
    }


}
