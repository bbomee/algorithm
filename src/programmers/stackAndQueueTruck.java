package programmers;

import java.util.ArrayList;
import java.util.List;

public class stackAndQueueTruck {

	public static void main(String[] args) {
		int[] truck = {7,4,5,6};
		int result = solution(2, 10, truck);

	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        List<Integer> waitTruckList = new ArrayList<>();
        for(int i = 0; i < truck_weights.length; i++) {
        	waitTruckList.add(truck_weights[i]);
        }
        
        int time = 1;
        int cou
        List<Integer> roadTruck = new ArrayList<>();
        while(roadTruck.size() == 0) {
        	time++;
        	if(time % bridge_length == 0) {
        		roadTruck.remove(0);
        	}
        	roadTruck.add(waitTruckList.get(0));
        	waitTruckList.remove(0);
        }
        return answer;
    }

}
