package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 여행경로 {
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String[] answer = solution(tickets);
		/*for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}*/
	}
	
	public static String[] solution(String[][] tickets) {
		String[] answer = {};
		List<String[]> ansList = new ArrayList<>();
		
		
		boolean[] visit = new boolean[tickets.length];
		String[] ans = new String[tickets.length+1];
		for(int i = 0; i < tickets.length; i++) {
			if(tickets[i][0].equals("ICN") && !visit[i]) {
				visit[i] = true;
				ans[0] = "ICN";
				quest(ansList, ans, tickets, tickets[i][1], visit, 1);
				visit[i] = false;
			}
		}
		
		Collections.sort(ansList, new Comparator<String[]>() {
			public int compare(String[] a, String[] b) {
				return a[0].compareTo(b[0]);
				/*for(int i = 0; i < a.length; i++) {
					if(a[i].compareTo(b[i]) != 0) return a[i].compareTo(b[i]);
				}
				return 0;*/
			}
		});
		
		for(int i = 0; i < ansList.size(); i++) {
			for(int j = 0; j < ansList.get(i).length; j++) {
				System.out.print(ansList.get(i)[j] + " ");
			}
			System.out.println();
		}
		
		return ansList.get(0);
	}
	
	public static void quest(List<String[]> ansList, String[] ans, String[][] tickets, String start, boolean[] visit, int cnt) {
		if(cnt == tickets.length) {
			ans[cnt] = start;
			String[] temp = new String[ans.length];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = ans[i];
			}
			ansList.add(temp);
			return;
		} else {
			for(int i = 0; i < tickets.length; i++) {
				if(tickets[i][0].equals(start) && !visit[i]) {
					visit[i] = true;
					ans[cnt] = start;
					quest(ansList, ans, tickets, tickets[i][1], visit, cnt+1);
					visit[i] = false;
				}
			}
		}
		
	}
}
