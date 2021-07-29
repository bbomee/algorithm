package programmers;

public class 피보나치수 {

	public static void main(String[] args) {
		System.out.println(solution(6));

	}
	
	public static int solution(int n) {
		int answer = 0;
        int[] temp = new int[n+1];
        int start = 0;
        while(start <= n) {
        	if(start == 0 || start == 1) {
        		temp[start] = start;
        	} else {
        		temp[start] = temp[start-1] + temp[start-2];
        	}
        	start++;
        }
        return temp[n] % 1234567;
    }
	
/*	public static void Fibonacci(int n, int[] temp, int start) {
		if(start == n) {			
			return;
		} else if(start == 0 || start == 1){
			temp[start] = start;
			System.out.println(temp[start]);
			start++;
			Fibonacci(n, temp, start);
		}else {
			temp[start] = temp[n-1] + temp[n-2];
			System.out.println(temp[start]);
			start++;
			Fibonacci(n, temp, start);
		}
	}*/
	
}
