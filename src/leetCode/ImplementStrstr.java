package leetCode;

public class ImplementStrstr {
	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "pi";
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle) {
		if(haystack.length() == 0 && needle.length() == 0 || needle.length() == 0) {
			return 0;
		} else if(haystack.length() < needle.length()) {
			return -1;
		}
        
        /*for(int i = 0; i <= haystack.length()-needle.length(); i++) {
        	String s = "";
        	if(haystack.charAt(i) == needle.charAt(0)) {
        		for(int j = i; j < i + needle.length(); j++) {
            		s = s + haystack.charAt(j);
            	}
            	if(s.equals(needle)) {
            		return i;
            	}
        	}
        	
        }*/
		
		boolean include = true;
		
		for(int i = 0; i < haystack.length() - needle.length() +1; i++) {
			for(int j = 0; j < needle.length(); j++) {
				//System.out.println(haystack.charAt(i+j) + " " + needle.charAt(j));
				if(haystack.charAt(i+j) != needle.charAt(j)) { 
					include = false;
					break;
				} else if(include == false && haystack.charAt(i+j) == needle.charAt(j)){
					include = true;
				}
			}
			if(include) {
				return i;
			}
		}
		return -1;
    }
	
}
