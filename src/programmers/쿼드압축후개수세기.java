package programmers;

public class 쿼드압축후개수세기 {

	public static void main(String[] args) {
		int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int[] answer = solution(arr);
		
		System.out.println(answer[0] + " " + answer[1]);

	}
	
	public static int[] solution(int[][] arr) {
        int[] answer = new int[2];
        compression(arr, answer);
        
        return answer;
    }
	
	public static void compression(int[][] arr, int[] answer) {
		if(arr.length == 1) {
			if(arr[0][0] == 0) answer[0]++;
			else answer[1]++;
			return;
		}
		
		int zero = 0;
		int one = 0;
		for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr.length; j++) {
        		if(arr[i][j] == 0) zero++;
        		else one++;
        	}
        }
		
		if(zero == 0) {
			answer[1]++;
			return;
		} else if(one == 0) {
			answer[0] ++;
			return;
		} else {
			int[][] temp1 = new int[arr.length/2][arr.length/2];
			int[][] temp2 = new int[arr.length/2][arr.length/2];
			int[][] temp3 = new int[arr.length/2][arr.length/2];
			int[][] temp4 = new int[arr.length/2][arr.length/2];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					if(i < arr.length/2 && j < arr.length/2) {
						temp1[i][j] = arr[i][j];
					} else if(i < arr.length/2 && j >= arr.length/2) {
						temp2[i][j-arr.length/2] = arr[i][j];
					} else if(i >= arr.length/2 && j < arr.length/2) {
						temp3[i-arr.length/2][j] = arr[i][j];
					} else {
						temp4[i-arr.length/2][j-arr.length/2] = arr[i][j];
					}
				}
			}
			 compression(temp1, answer);
			 compression(temp2, answer);
			 compression(temp3, answer);
			 compression(temp4, answer);
		}
	}
	
	

}
