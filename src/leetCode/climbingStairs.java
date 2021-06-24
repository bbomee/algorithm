package leetCode;

public class climbingStairs {

	public static void main(String[] args) {
		System.out.println("답: " + climbStairs(5));
	} 
	
	public static int climbStairs(int n) {
		int[] temp = new int[n+1];
		if(n <= 2) {
			return n;
		} else {
			temp[1] = 1;
			temp[2] = 2;
			return nextStep(n-1, temp) + nextStep(n-2, temp);
		}
    }
	
	public static int nextStep(int n, int[] temp) {
		if(temp[n] > 0) {
			return temp[n];
		} else {
			temp[n] = nextStep(n-1, temp) + nextStep(n-2, temp);
		}
		return temp[n];
	}
}
