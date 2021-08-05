package algorithm;

public class powerSet {

	private static char data[] = {'a', 'b', 'c'};
	//, 'd', 'e', 'f'
	private static int n = data.length;
	private static boolean [] include = new boolean [n];
	
	public static void main(String[] args) {
		System.out.println(n);
		powerSet(0);

	}
	
	public static void powerSet(int k) {
		if (k==n) {
			for(int i = 0; i < n ; i++) {
				if(include[i]) System.out.print(data[i] + " ");

			}
			System.out.println();
			return;
		}
		include[k] = true;//k번째를 포함할 때
		powerSet(k+1);
		include[k] = false; //k번째를 포함하지 않을 때
		powerSet(k+1);
		
	}

}
