package boostcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		String[] param0 = {"/t.z", "/z/z_v2.z",  "/a.z" , "/d/b.z", "/d/a/t.z"};
		/d/a/b/x/c_v2.x
		
		a.x 2 t.x 3
		
		//String s = "a_v3.x";
		//int po = s.indexOf(".");
		
		System.out.println(solution(param0));
	}
	
	public static String[] solution(String[] param0) {
		
		String[] clean = new String[param0.length];
		for(int i = 0; i < param0.length; i++) {
			int point = param0[i].indexOf(".");
			String s = "";
			if
			if(param0[i].charAt(point-3) == '_') {
				s += param0[i].charAt(point-4);
				s += '.';
				s += param0[i].charAt(point+1);
			} else {
				s += param0[i].substring(point-1, point+2);
			}
			clean[i] = s;
		}
		Arrays.sort(clean);
		for(int i = 0; i < clean.length; i++) {
			System.out.println(clean[i]);
		}
		System.out.println("--");
		List<String> temp = new ArrayList<>();
		
		int count = 1;
		for(int i = 1; i < clean.length; i++) {
			if(clean[i].equals(clean[i-1])) {
				count++;
				if(i == clean.length-1) {
					temp.add(clean[i]);
					temp.add(count+"");
				}
			} else {
				if(count > 1) {
					temp.add(clean[i-1]);
					temp.add(count+"");
				}
				count = 1;
			}
		}
		
		String[] answer = new String[temp.size()];
		
		/*for(int i = 0; i < temp.size(); i++) {
			answer[i] = temp.get(i);
			System.out.println(answer[i]);
		}*/
		return answer;
	}
	

}
