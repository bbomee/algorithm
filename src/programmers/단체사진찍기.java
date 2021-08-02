package programmers;

import java.util.ArrayList;
import java.util.List;

public class 단체사진찍기 {

	public static void main(String[] args) {
		String[] data = {"N~F=0", "R~T>2"};
		System.out.println(solution(2,data));

	}
	
	public static int solution(int n, String[] data) {
		int cnt = 0;
        char[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        List<char[]> friendsList = new ArrayList<>();
        perm(friends, 0, friendsList);       
        
        for(int i = 0; i < friendsList.size(); i++) {
        	char[] temp = friendsList.get(i);
        	for(int j = 0; j < data.length; j++) {
        		char[] dt = data[j].toCharArray();
        		int prev = 0; int next = 0;
        		boolean condition = false;
        		for(int k = 0; k < temp.length; k++) {
        			if(temp[k] == dt[0]) prev = k;
        			if(temp[k] == dt[2]) next = k;
        		}
        		int interval = Math.abs(next-prev)-1;
        		int compare = Integer.parseInt(dt[4]+"");
        		if(dt[3] == '=') {
        			if(interval == compare) condition = true;
        			else break;
        			
        		} else if(dt[3] == '<') {
        			if(interval < compare) condition = true;
        			else break;
    			} else if(dt[3] == '>') {
    				if(interval > compare) condition = true;
        			else break;
    			}
        		if(condition && j == data.length-1) {
        			cnt++;
        			break;
        		}
        	}
        }
        return cnt;
    }
	
	public static void perm(char[] friends, int k, List<char[]> friendsList) {
		if(k == friends.length) {
			char[] temp = new char[friends.length];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = friends[i];
			}
			friendsList.add(temp);
			return;
		}  else {
			for(int i = k; i < friends.length; i++) {
				swap(friends, k, i);
				perm(friends, k+1, friendsList);
				swap(friends, k, i);
			}
		}
	}
	
	public static void swap(char[] friends, int a, int b) {
		char temp = friends[a];
		friends[a] = friends[b];
		friends[b] = temp;
	}

}
