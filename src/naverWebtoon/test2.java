package naverWebtoon;

import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		String s ="abcsdfsfabc";
				//"abcsdfsfabc";
		solution(s);

	}
	public static String[] solution(String s) {
		int last = 0;
        int remain = 0;
		String[] str = s.split("");
        List<String> ans = new ArrayList<>(); 
        
        for(int i = 0; i < s.length()/2; i++) {
        	int cnt = 0;
        	while(i <= s.length()-last) {
        		last++;
        		cnt++;
        		
        		if(str[i].equals(str[str.length-last])) {
        			if(i == str.length-last) remain = 1;
        			if(s.substring(i, i+cnt).equals(s.substring(str.length-last, str.length-last+cnt))) {
        				System.out.println(i+ " " + cnt);
        				ans.add(s.substring(i, i+cnt));
                		i += cnt-1;
                		cnt = 0;
                		break;
        			}
        		}
        	}
        }
        
        int odd = s.length()%2;
        String[] answer = {};
        
        if(s.length()%2 == 1 && remain != 1) {
        	answer = new String[ans.size()*2 + 1];
        	answer[answer.length/2] = str[str.length/2];
        } else {
        	answer = new String[ans.size()*2 - remain];
        }
              
        for(int i = 0; i < ans.size(); i++) {
        	if(i == ans.size()-1 && remain == 1) {
        		answer[i] = ans.get(i);
        	} else {
        		answer[i] = ans.get(i);
        		answer[answer.length-i-1] = ans.get(i);
        	}
        }
        
        for(int i = 0 ; i < answer.length; i++) {
        	System.out.println("i:" + i + answer[i]);
        }
        return answer;
    }
}
