package leetCode;

public class addInteger {

	public static void main(String[] args) {
		String num1 = "3876620623801494171";
		String num2 = "6529364523802684779";
		System.out.println(addStrings(num1, num2));

	}
	
	public static String addStrings(String num1, String num2) {
		long n1 = Long.parseLong(num1);
		long n2 = Long.parseLong(num2);
		
		/*int[] n1 = new int[4];
		int[] n2 = new int[4];
		
		for(int i = 0; i < 4; i++) {
			if(i < 4 - num1.length()) {
				n1[i] = 0;
			} else {
				n1[i] = Integer.parseInt(num1.charAt(num1.length()-4+i)+"");
			}
			if(i < 4 - num2.length()) {
				n2[i] = 0;
			}
			
		}*/
		return Long.toString(n1+n2);
	}

}
