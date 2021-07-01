package programmers;

import java.util.Arrays;

public class 최댓값과최솟값 {

	public static void main(String[] args) {
		String s = "-4 -3 4 10 -8 -2 -1 5 7 ";
		System.out.println(solution(s));

	}
	public static String solution(String s) {
        String answer = "";
        String[] tempS = s.split(" ");
        int[] temp = new int[tempS.length];
        for(int i = 0; i < temp.length; i++) {
        	temp[i] = Integer.parseInt(tempS[i]);
        }
        Arrays.sort(temp);
        return temp[0] + " " + temp[temp.length-1];
    }

}
