package leetCode;

import java.util.ArrayList;
import java.util.List;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a,b));
	}   
	public static String addBinary(String a, String b) {
		//무조건 a가 더 길다고 가정
		if(a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		/*int[] arrayA = new int[a.length()];
        int[] arrayB = new int[b.length()];
		for(int i = 0; i < a.length(); i++) {
			arrayA[i] = Integer.parseInt(a.charAt(i)+"");
		}
		for(int j = 0; j < b.length(); j++) {
			arrayB[j] = Integer.parseInt(b.charAt(j)+"");
		}*/
		
		boolean up = false;
		List<Integer> arrList = new ArrayList<>();
		for(int i = 0; i < a.length(); i++) {
			if(i < b.length()) {
				int sum = Integer.parseInt(a.charAt(a.length()-1-i)+"") + Integer.parseInt(b.charAt(b.length()-1-i)+"");
				if(!up) {
					if(sum == 2) {
						System.out.println(i + " " + 1);
						up = true;
						arrList.add(0);
					} else {
						System.out.println(i + " " + 2);
						arrList.add(sum);
					}
				} else {
					if(sum >= 1) {
						System.out.println(i + " " + 3);
						arrList.add(sum-1);
					} else {
						System.out.println(i + " " + 4);
						up = false;
						arrList.add(1);
					}
				}
				if(up && i == a.length()-1) {
					System.out.println(i + " " + 5);
					arrList.add(1);
				}
			} else {
				if(!up) {
					System.out.println(i + " " + 6);
					arrList.add(Integer.parseInt(a.charAt(a.length()-1-i)+""));
				} else {
					if(Integer.parseInt(a.charAt(a.length()-1-i)+"") == 1) {
						System.out.println(i + " " + 7);
						arrList.add(0);
						if(i == a.length()-1) {
							arrList.add(1);
						}
					} else {
						System.out.println(i + " " + 8);
						up = false;
						arrList.add(1);
					}
				}
			}
		}
		String result = "";
		for(int i = 0; i < arrList.size(); i++) {
			result += ""+arrList.get(arrList.size()-i-1);
		}
		return result;
    }
}
