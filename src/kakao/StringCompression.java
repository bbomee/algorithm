package kakao;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {
	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		int min = s.length();
		for(int i = 1; i <= s.length()/2; i++) {
			int listSize = nCompressionList(i, s);
			if(min > listSize) {
				min = listSize;
			}
		}
	}
	public static int nCompressionList(int n, String s) {
		List<String> list = new ArrayList<>();
		int same = 1;
		int i = 0;
		while(i < s.length()-2*n+1) {
			String temp = "";
			String nextTemp = "";
			for(int j = 0; j < n; j++) { 
				temp += s.charAt(i+j);
				nextTemp += s.charAt(i+j+n);
			}
			if(temp.equals(nextTemp)) { same++; } 
			else {
				if(same > 1) {
					list.add(same + "");
					list.add(temp);
					same = 1;
				} else {
					list.add(temp);
				}
			}						
			i += n;
			if(s.length()-i < 2*n) {
				if(same > 1) {
					list.add(same + "");
					list.add(temp);
					for(int j = i+n; j <s.length(); i++) {
						list.add(s.charAt(j) + "");
					}
				} else {
					for(int j = i; j < s.length(); j++) {
						list.add(s.charAt(j) + "");
					}
				}
			}
		}		
		String sl = "";
		for(int j = 0; j < list.size(); j++) {
			sl += list.get(j);
		}
		return sl.length();
	}
}
