package algorithm;

public class nQueens {
	private static int N = 8;
	private static int[] cols = new int[N];
	
	public static void main(String[] args) {
		
		
		System.out.println(queens(0));
	}
	
	public static boolean queens(int level) {
		for(int i = 0; i < N; i++) {
			cols[level] = i;
			if(!promising(level)) {
				return false;
			} else if(level == N-1) {
				return true;
			} else if(queens(level+1)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean promising(int level) {
		for(int i = 0; i < level; i++) {
			if(cols[i] == cols[level]) {
				return false;
			} else if(level - i == Math.abs(cols[level]-cols[i])) {
				return false;
			}
		}
		return true;
	}

}
