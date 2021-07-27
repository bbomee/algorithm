package programmers;

public class 다음큰숫자 {

	public static void main(String[] args) {
		System.out.println(solution(15));
		System.out.println(solutionByChar(78));
		System.out.println(solutionByBit(78));
	}
	
	public static int solution(int n) {
        String s = Integer.toBinaryString(n);
        String[] str = s.split("");
        int[] result = check(str);
        String res = "";
        if(result[0] != -1) {
        	res = s.substring(0,result[0]) + "1";
        	result[2]--;
        	result[1]++;
        	for(int i = 0; i < result[1]; i++) {
        		res += "0";
        	}
        	
        	for(int i = 0; i < result[2]; i++) {
        		res += "1";
        	}
        } else {
        	res += "1";
        	result[2]--;
        	result[1]++;
        	for(int i = 0; i < result[1]; i++) {
        		res += "0";
        	}
        	
        	for(int i = 0; i < result[2]; i++) {
        		res += "1";
        	}
        }
        return Integer.parseInt(res, 2);
    }
	
	public static int[] check(String[] str) {
		int[] result = {-1,0,0}; // check, zero, one
		for(int i = str.length-1; i > 0; i--) {
			if(str[i].equals("0")) {
				result[1]++;
			} else if(str[i].equals("1")) {
				result[2]++;
			}
			
			if(str[i-1].equals("0") && str[i].equals("1")) {
				result[0] = i-1;
				return result;
			} else if(i-1 == 0) {
				if(str[i-1].equals("0")) {
					result[1]++;
				} else if(str[i-1].equals("1")) {
					result[2]++;
				}
			}
		}
		return result;
	}
	
	public static int solutionByChar(int n) {
		char[] strNum = Integer.toBinaryString(n).toCharArray();
		int oneCnt = 0;
		for(int i = 0; i < strNum.length; i++) {
			if(strNum[i] == '1') oneCnt++;
		}
		
		for(int i = n+1; i <= 1000000; i++) {
			int oneTemp = 0;
			
			char[] numTemp = Integer.toBinaryString(i).toCharArray();
			for(int j = 0; j < numTemp.length; j++) {
				if(numTemp[j] == '1') oneTemp++;
			}
			if(oneTemp == oneCnt) return i;
		}
		return n;
	}
	
	public static int solutionByBit(int n) {
		int bitCnt = Integer.bitCount(n);
		for(int i = n+1; i < 1000000; i++) {
			if(bitCnt == Integer.bitCount(i)) return i;
		}
		return n;
	}
	


}
