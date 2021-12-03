package programmers;

public class 스티커모으기 {

	public static void main(String[] args) {
		int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};
		System.out.println(solution(sticker));
	}
	
	public static int solution(int sticker[]) {
        int answer = 0;
        int[] firstAdd = new int[sticker.length];
        int[] LastAdd = new int[sticker.length];
        
        firstAdd[0] = sticker[0];
        firstAdd[1] = sticker[0]; //1번까지 0+1
        LastAdd[1] = sticker[1];
        
        for(int i = 2; i < sticker.length; i++) {
        	firstAdd[i] = Math.max(firstAdd[i-2]+sticker[i], firstAdd[i-1]);
        	LastAdd[i] = Math.max(LastAdd[i-2]+sticker[i], LastAdd[i-1]);
        }
        
        return Math.max(firstAdd[sticker.length-2], LastAdd[sticker.length-1]);
    }
}
