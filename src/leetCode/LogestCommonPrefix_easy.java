package leetCode;

public class LogestCommonPrefix_easy { //앞에만 같으면 되는 중복값

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 1) {
			return strs[0];
		}
		String result = "";
		for(int i = 0 ; i < strs.length; i++) {
			if(i == 0) {
				result = commonPrefix(strs[i], strs[i+1]);
				i++;
			} else {
				result = commonPrefix(result, strs[i]);
			}		
		}
		return result;
	}
	
	public static String commonPrefix(String s1, String s2) {
		String result = "";
		int shortSize = shortSize(s1, s2);
		for(int j = 0 ; j < shortSize; j++) {
			if(s1.charAt(j) == s2.charAt(j)) {
				result = result + s1.charAt(j);
			} else {
				break;
			}
		}
		return result;
	}
	
	public static int shortSize(String s1, String s2) {
		if(s1.length() <= s2.length()) {
			return s1.length();
		}
		return s2.length();
	}

}
