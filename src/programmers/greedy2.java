package programmers;

public class greedy2 {

	public static void main(String[] args) {
		char a = "A".charAt(0);
		char z = "Z".charAt(0);
		int num = (int)a;
		String name = "BBBBAAAAAB";
		//System.out.println(z-a);
		System.out.println(solution(name));

	}
    public static int solution(String name) {
        //1.현재 값이 A인지 확인
    	//2.현재 위치에서 아스키 값 차이만큼 움직여야 해당 값으로 변함
    	//3. 다음 문자가 A가 아니면 무조건 다음 값으로 가서 1번수행
    	//4. 다음 문자가 A면 A가 안나올때까지 움직 인후 해당 위치까지 원래 위치에서 왼쪽이 빠른지 오른쪽이 빠른지 확인 후 그만큼을 더하고 1번수행
    	char A = "A".charAt(0);
    	char Z = "Z".charAt(0);
    	int answer = 0;
    	int cursor = 0; //저장해 둘 커서 값
    	boolean back = false;
    	for(int i = 0; i < name.length(); i++) {
    		//1번
    		if(name.charAt(i) != A) {
    			//2번
    			if(name.charAt(i) - A > 13) {
    				answer += Z - name.charAt(i)+1;
    			} else {
        			answer += name.charAt(i)-A;
    			}
    			
    			//4번
    			if(i != cursor) {
    				if(i - cursor > name.length() - (i - cursor)) {
    					System.out.println("여기");
    					if(!back) {
    						answer -= name.length()-i-1;
    						back = true;
    					}
        				answer += name.length() - (i - cursor);
        				cursor = i;
        			} else {
        				//System.out.println(i-cursor);
        				answer += i - cursor;
            			cursor = i;
        			}
    			}
    			
    		} else if(i != name.length()-1){ //1번  -> 3번
    			//JAAAAAB
    			while(name.charAt(i+1) == A) {
    				i++;
    				if(i == name.length()-1) break;
    			}
    			//System.out.println(i);
    		}
    		System.out.println("i: " + i + "answer: " + answer);
    	}
        return answer;
        
        
    }

}
