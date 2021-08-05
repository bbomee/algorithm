package programmers;

public class travelRoute {

	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
			//{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
			//{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String[] result = solution(tickets);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static String[] solution(String[][] tickets) {
		for(int i = 0; i < tickets.length-1; i++) {
			if(tickets[i][1].compareTo(tickets[i+1][1]) < 0) {
				String[] temp = tickets[i];
				tickets[i] = tickets[i+1];
				tickets[i+1] = temp;
			}
		}
		
		/*for(int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i][0] + ", " + tickets[i][1]);
		}*/
        String[] answer = new String[tickets.length+1];
        boolean[] visited = new boolean[tickets.length];
        for(int i = 0; i < tickets.length; i++) {
        	if(tickets[i][0].equals("ICN")) {
        		answer[0] = "ICN";
        		visited[i] = true;
        		travelRoute(visited, answer, tickets, tickets[i][1], 1);
        		visited[i] = false;
        	}
        }
        return answer;
    }
	
	public static void travelRoute(boolean[] visited, String[] answer, String[][] tickets, String start, int k) {
		if(k == tickets.length) {
			answer[k] = start;
			return;
		}
		for(int i = 0; i < tickets.length; i++) {
			if(!visited[i]) {
				if(tickets[i][0].equals(start)) {
					visited[i] = true;
					answer[k] = tickets[i][0];
					travelRoute(visited, answer, tickets, tickets[i][1], k+1);
					visited[i] = false;
					return;
				}
			}
		}
	}
	
}
