package programmers;

public class network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int n, int[][] computers) {
        int answer = n;
        for(int i = 0; i < computers.length; i++) {
        	answer -= search(n, computers[i], i+1, 0);
        }
        return answer;
    }
	
	public int search(int n , int[] computer, int i, int link) {
		if(i == n) {
			return 0;
		}
		for(int i = 0; i < n; i++) {
			
		}
		return link + search(n, computer, i, link);
	}

}
