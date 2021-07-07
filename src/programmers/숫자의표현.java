package programmers;

public class 숫자의표현 {

	public static void main(String[] args) {
		System.out.println(solution(15));

	}
	public static int solution(int n) {
        int answer = 1;
        for(int i = 1; i <= n/2; i++) {
        	int sum = 0;
        	int start = i;
        	while(sum < n) {
        		sum += start;
        		start++;
        		if(sum == n) answer++;
        	}
        }
        return answer;
    }
}
