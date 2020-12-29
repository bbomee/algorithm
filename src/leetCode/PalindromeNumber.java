package leetCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 90009;
		if(isPalindrome(x) == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
    
	public static boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}

		//배열에 숫자를 넣는다.	
		int []arr = new int[sizeNum(x)];
		for(int i = 0; i < arr.length; i++) {
			int sn = sizeNum(x);
			if(sn != arr.length-i) {
				arr[i] = 0;
			} else {
				int rn = realNum(x);
				arr[i] = rn;
				x = x - zegop(rn, sn);
			}
			
		}
		//반복문을 돌려서 왼쪽과 오른쪽을 비교 점점 가운데로 들어온다.
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			int end = arr.length-i-1;
			if(i >= end) {
				break;
			}
			if(arr[i] != arr[end] ) {
				return false;
			}
		}
		return true;
    }
	
	public static int sizeNum(int n) {
		int size = 0;
		while(n >= 1) {
			n = n/10;
			size++;
		}
		return size;
	}
	
	public static int realNum(int x) {
		if(x == 0) {
			return 0;
		}
		while(x >= 10) {
			x = x/10;
		}
		return x;
	}
	
	public static int zegop(int x, int size) {
		for(int i = 0 ; i < size-1; i++) {
			x = x*10;
		}
		return x;
	}

}
