package programmers;

import java.util.PriorityQueue;

public class 행렬테두리회전하기 {

	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		solution(rows, columns, queries);
	}

	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		
		int[][] field = new int[rows][columns];
		
		int num = 1;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				field[i][j] = num++;
			}
		}
		
		for(int i = 0; i < queries.length; i++) {
			int startRow = queries[i][0]-1;
			int endRow = queries[i][2]-1;
			int startCol = queries[i][1]-1;
			int endCol = queries[i][3]-1;
			
			int nextIdx = 0;
			int remainNum = field[startRow][startCol];
			PriorityQueue<Integer> heap = new PriorityQueue<>();
			
			int[] front = {startRow, startCol};
			int[] end = { startRow+1, startCol};
			field[front[0]][front[1]] = field[end[0]][end[1]];
			heap.add(field[end[0]][end[1]]);
			//하
			while(end[0] < endRow) {
				front[0] = end[0];
				front[1] = end[1];
				end[0]++;
				field[front[0]][front[1]] = field[end[0]][end[1]];
				heap.add(field[end[0]][end[1]]);
			}
			
			//우
			while(end[1] < endCol) {
				front[0] = end[0];
				front[1] = end[1];
				end[1]++;
				field[front[0]][front[1]] = field[end[0]][end[1]];
				heap.add(field[end[0]][end[1]]);
			}
			
			//상
			while(end[0] > startRow) {
				front[0] = end[0];
				front[1] = end[1];
				end[0]--;
				field[front[0]][front[1]] = field[end[0]][end[1]];
				heap.add(field[end[0]][end[1]]);
			}
			
			//좌
			while(end[1] > startCol) {
				front[0] = end[0];
				front[1] = end[1];
				end[1]--;
				if(end[0] == startRow && end[1] == startCol) break;
				field[front[0]][front[1]] = field[end[0]][end[1]];
				heap.add(field[end[0]][end[1]]);
			}
			
			field[startRow][startCol+1] = remainNum;
			heap.add(remainNum);
			answer[i] = heap.poll();
			System.out.println(answer[i]);
		}
		
		return answer;
	}
}
