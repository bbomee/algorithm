package leetCode;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "III";
		System.out.print(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
        int sl = s.length();
        int sum = 0;
        for(int i = 0; i < sl; i++) {
            if(s.charAt(i) == 'I'){
                if(i != sl-1 && s.charAt(i+1) == 'V') {
                    sum = sum + 4;
                    i++;
                } else if(i != sl-1 && s.charAt(i+1) == 'X') {
                    sum = sum + 9;
                    i++;
                } else {
                    sum = sum + 1;
                }
            } else if(s.charAt(i) == 'V') {
                sum = sum + 5;
            } else if(s.charAt(i) == 'X') {
                if(i != sl-1 && s.charAt(i+1) == 'L') {
                    sum = sum + 40;
                    i++;
                } else if(i != sl-1 && s.charAt(i+1) == 'C') {
                    sum = sum + 90;
                    i++;
                } else {
                    sum = sum + 10;
                }
            } else if(s.charAt(i) == 'L') {
                sum = sum + 50;
            } else if(s.charAt(i) == 'C') {
                if(i != sl-1 && s.charAt(i+1) == 'D') {
                    sum = sum + 400;
                    i++;
                } else if(i != sl-1 && s.charAt(i+1) == 'M') {
                    sum = sum + 900;
                    i++;
                } else {
                    sum = sum + 100;
                }
            } else if(s.charAt(i) == 'D') {
                sum = sum + 500;
            } else if(s.charAt(i) == 'M') {
                sum = sum + 1000;
            }
        }
        return sum;
    }

}
