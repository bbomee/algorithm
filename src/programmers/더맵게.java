package programmers;

import java.util.*;
import java.util.Arrays;

public class 더맵게 {

	public static void main(String[] args) {
		int[] scoville = {1,2, 3, 9, 10, 12};
		System.out.println(solution(scoville, 7));

	}
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) {
        	heap.add(scoville[i]);
        }
        
        int cnt = 0;
        while(heap.peek() < K) {
        	int mix = heap.poll() + heap.poll()*2;
        	if(mix == 0) {
        		return -1;
        	} else {
            	heap.add(mix);
        	}
        	cnt++;
        }
        
		return cnt;
    }

}
