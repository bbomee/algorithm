package programmers;

import java.util.ArrayList;
import java.util.List;

public class 다리를지나는트럭 {

	public static void main(String[] args) {
		int bridge_length = 2; 
		int weight=10; 
		int[] truck_weights = {7,4,5,6};
		
	}
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        List<Integer> truck = new ArrayList<>();
		List<Integer> bridge = new ArrayList<>();
		for(int i = 0; i < truck_weights.length; i++) {
			truck.add(truck_weights[i]);
		}
		
		int sum = 0;
		
		for(int i = 0; i < truck_weights.length; i++) {
			if(sum + truck_weights[i] <= weight) {
				sum += truck_weights[i];
				
			} else {
				
			}
			answer += bridge_length;
		}
		while(truck.size() != 0 && bridge.size() != 0) {
		}
        return answer;
    }

}
