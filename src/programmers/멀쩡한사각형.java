package programmers;

import java.math.BigInteger;

public class 멀쩡한사각형 {

	public static void main(String[] args) {
		int w, h;
		w = 8;
		h = 12;
		
		System.out.println(solution(w, h));
	}
	
	public static long solution(int w, int h) {
        //long answer = 1;
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        
        return w*h - (w/gcd + h/gcd-1) * gcd ;
    }

}
