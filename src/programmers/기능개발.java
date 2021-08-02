package programmers;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] ans = solution2(progresses, speeds);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
				
		System.out.println();
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        while(start < speeds.length) {
        	for(int i = 0; i <progresses.length; i++) {
        		progresses[i] += speeds[i];
        		if(progresses[i] >= 100) {
        			progresses[i] = 0;
        			speeds[i] = 0;
        		}
        	}
        	if(progresses[start] == 0) {
        		int cnt = 1;
        		for(int i = start+1; i < progresses.length; i++) {
        			if(progresses[i] == 0) cnt++; 
        			else break;
        		}
        		start += cnt; 
        		ans.add(cnt);
        	}
        }

        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
        	answer[i] = ans.get(i);
        }
        
        return answer;
    }
	
	public static int[] solution2(int[] progresses, int[] speeds) {
		int[] remain = new int[progresses.length];
		List<Integer> ans = new ArrayList<>();

		int start = 0;
		for(int i = 0; i < remain.length; i++) {
			int r = (100 - progresses[i])/speeds[i];
			if((100 - progresses[i]) % speeds[i] != 0) r++;
			remain[i] = r;
			
			if(remain[start] < remain[i]) {
				ans.add(i-start);
				start = i;
			}
			if(i == remain.length-1) ans.add(i-start+1);
			
		}
		
		int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
        	answer[i] = ans.get(i);
        }
		
		return answer;
	}

}
