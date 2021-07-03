package programmers;

public class 예상대진표 {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		System.out.println(solution2(n, a, b));
	}
	public static int solution(int n, int a, int b) {
        int answer = 0;
        int small, big;
        if(a < b) { small = a;big = b; }
        else { small = b; big = a; }
        
        while(n >= 2) {
            answer++;
            if(big - small < 2 && big % 2 == 0) {
                break;
            } else {
                if(small % 2 == 0) small /= 2;
                else small = small/2 +1;
                
                if(big % 2 == 0) big /= 2;
                else big = big/2 +1 ;
            }
            n /= 2;
        }
        return answer;
    }
	
	public static int solution2(int n, int a, int b) {
		int cnt = 0;
		while(a != b) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			cnt++;
		}
		return cnt;
	}
}

