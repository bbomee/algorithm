package programmers;

public class 가장큰정사각형찾기 {

	public static void main(String[] args) {
		

	}
	public int solution(int [][]board) {
        int answer = 0;
        int w = 0;
        int h = 0;
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[0].length; j++) {
        		if(board[i][j] == 1) {
        			w = i;
        			h = j;
        			while(w < board.length && h < board[0].length) {
        				if(board[i][j])
        			}
        		}
        	}
        }
        

        return answer;
    }

}
