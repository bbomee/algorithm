package programmers;

public class skillTestLevel2 {

	// 이진수의 숫자가 2이하로 차이나고 입력값보다 큰 수 찾기
	public static void main(String[] args) {
		long[] numbers = {2,7};
		solution(numbers);

	}
	public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
        	if(numbers[i] == 1) {
        		answer[i] = 2;
        	} else {
        		String s = Long.toBinaryString(numbers[i]);
            	for(int j = s.length()-1; j >= 0; j--) {
            		if(s.charAt(j) == '0' && j == s.length()-1) {
            			answer[i] = Long.parseLong(s.substring(0,j) + "1", 2);
            			break;
            		} else if(s.charAt(j) == '0' && j == s.length()-2) {
            			answer[i] = Long.parseLong(s.substring(0,j) + "1" + "0", 2);
            			break;
            		} else if(s.charAt(j) == '0' && j < s.length()-2) {
            			answer[i] = Long.parseLong(s.substring(0,j) + "1" + "0" + s.substring(j+2), 2);
            			break;
            		} else if(s.charAt(j) == '1' && j == 0) {
            			answer[i] = Long.parseLong("1" + "0" + s.substring(1), 2);
            			break;
            		}
            	}
        	}
        }
        return answer;
    }
}
