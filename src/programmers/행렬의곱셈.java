package programmers;

public class 행렬의곱셈 {

	public static void main(String[] args) {
		int[][] arr1 = {{1,4}, {3,2}, {4,1}};
		int[][] arr2 = {{3,3} ,{3,3}};
		System.out.println(solution(arr1, arr2)[0][0]);
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length; 
        int col = arr2[0].length;
		int[][] answer = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				int sum = 0;
				for(int k = 0; k < arr1[0].length; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				answer[i][j] = sum;
			}
		}
        return answer;
    }

}
