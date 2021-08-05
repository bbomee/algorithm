package algorithm;

public class question {

	public static void main(String[] args) {
		System.out.println("answer: " + climbStairs(3));
	} 
	
	public static int climbStairs(int n) {
		int[] num = new int[n];
		nextStep(n, num);
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		return num.length;
    }
	
	public static void nextStep(int n, int[] num) {
		if(n == 0) {
			num[0] = 0;
			return;
		} else {
			n--;
			num[n] = n;
			nextStep(n, num);
		}
	}
}
