package programmers;
import java.util.*;

public class ExhaustiveSearch {

	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5};
		solution(answers);
	}
	
    public static int[] solution(int[] answers) {
    	//0 1 2 3 4 
    	int[] a = {1,2,3,4,5};
		int[] b =  {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int[] abc = {0,0,0};
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == a[i%5]) abc[0]++;
			if(answers[i] == b[i%8]) abc[1]++;
			if(answers[i] == c[i%10]) abc[2]++;
		}
		
		int maxSize = 1;
		int max = abc[0];
		if(max < abc[1]) {
			max = abc[1];
		} else if (max == abc[1]) {
			maxSize++;
		}
		if(max < abc[2]) {
			max = abc[2];
		} else if(max == abc[2]) {
			maxSize++;
		}
		
		int[] result = new int[maxSize];
		int j = 0;
		for(int i = 0; i < 3; i++) {
			if(max == abc[i]) {
				result[j++] = i;
			}
		}
		
		return result;
    }

}
