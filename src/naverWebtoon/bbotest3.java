package naverWebtoon;

public class bbotest3 {

	public static void main(String[] args) {
		

	}
	public int solution(String s, String t) {
        int result = 0;
	      
	    while(s.contains(t)) {
	        s = s.replaceFirst(t, "");
	        result++;
	    }      
	            
	    return result;
    }
	

}
