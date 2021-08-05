package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class greedy1 {

	public static void main(String[] args) {
		int n = 4;
		int[] lost = {3,1};//13
		int[] reserve = {2,4};
		
		System.out.println(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		ArrayList<Integer> lostList = new ArrayList<>();    
        ArrayList<Integer> resList = new ArrayList<>();
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int l : lost) lostList.add(l); 
        for(int r : reserve) resList.add(r);
        
        for(int i = 0; i < lostList.size(); i++) {
        	if(resList.remove(lostList.get(i))) {
        		System.out.println("같을때" );
        		lostList.remove(i);
        		i--;
        	}
        }
        
        for(int i = 0; i < lostList.size(); i++) {
        	for(int j = 0; j < resList.size(); j++) {
        		System.out.println("i: " + i + " lostList(i) : " + lostList.get(i) + " j: " + j + "resList(j): " + resList.get(j));
        		if(lostList.get(i) == resList.get(j)-1 || lostList.get(i) == resList.get(j)+1) {
        			//System.out.println(i + " " + j);
        			lostList.remove(i);
        			resList.remove(j);
        			i--;
        			j--;
        			break;
        		}
        	}
        }
        
        
        return n-lostList.size();
    }
}
