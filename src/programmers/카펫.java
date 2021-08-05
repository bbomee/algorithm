package programmers;

public class 카펫 {

	public static void main(String[] args) {
		solution(8,1);
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int yelSum = (brown-4)/2;
        int yelWid = yelSum-1;
        int yelHeit = 1;
       
        while(yelWid >= yelHeit) {
        	if(yellow % yelWid == 0 && yelWid * yelHeit == yellow) {
            	answer[0] = yelWid + 2;
            	answer[1] = yelHeit + 2;
            	break;
            } 
        	yelWid--;
        	yelHeit++;
        }
        return answer;
    }

}
