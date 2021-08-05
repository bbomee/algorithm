package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class searchMirror {

	private static int N = 8;
	private static int [][] maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	private static int [][] maze2 = { 
			{0, 0},
			{1, 0},
			{2, 0},
			{3, 0},
			{4, 0},
			{5, 0},
			{6, 0},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	private static final int PATHWAY = 0;
	private static final int WALL = 1;
	private static final int BLOCKED = 2;
	private static final int PATH = 3;

	static ArrayList<int[]> list = new ArrayList<int[]>();
	
	public static void main(String[] args) {
		System.out.println(searchPath(0,0));
		int[][] answer = new int[list.size()][2];
		for(int i = 0; i < list.size(); i++) {
			 answer[i][0] = list.get(list.size()-i-1)[0];
			 answer[i][1] = list.get(list.size()-i-1)[1];
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i][0] + "," + answer[i][1]);
		}
		
	}
	
	public static boolean searchPath(int x, int y) {
		if(x < 0 || y <0 || x >= N || y >= N) {
			return false;
		} else if(maze[x][y] != PATHWAY ) {
			return false;
		} else if(x == N-1 && y == N-1) {
			maze[x][y] = PATH;
			list.add(new int[] {x,y});
			return true;
		} else {
			maze[x][y] = PATH;
			if(searchPath(x+1,y) || searchPath(x,y+1) || searchPath(x-1,y) || searchPath(x,y-1)) {
				list.add(new int[] {x,y});
				return true;
			}
			maze[x][y] = BLOCKED;
			return false;
		}
	}

}
