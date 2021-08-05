package programmers;

import java.util.Arrays;

public class sort1 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = solution(array, commands);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i <commands.length; i++) {
        	int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2]-1];
        }
        
        /*for(int i = 0; i < commands.length; i++) {
        	int[] c = new int[commands[i][1]-commands[i][0] + 1];
        	int idx = 0;
        	for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
        		//System.out.println(i + " " + j);
        		c[idx++] = array[j];
        	}
        	answer[i] = sortAndPick(c, commands[i][2]);
        }*/
        return answer;
    }
    
    public static int sortAndPick(int[] array, int k) {
    	Arrays.sort(array);
    	
    	return array[k-1];
    }

}
