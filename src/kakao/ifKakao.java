package kakao;

import java.util.ArrayList;
import java.util.List;

public class ifKakao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int[] start_time = {1};
		int[] running_time = {1};
		System.out.print(Max_run(n, start_time, running_time));
	}
	
	public static int Max_run(int n, int[] start_time, int[] running_time) {
		if(start_time.length == 1) {
			return 1;
		}

		List<Integer> start = new ArrayList<>();
		List<Integer> running = new ArrayList<>();


		for(int i = 0; i < n; i++) {
			if(i == 0) {
				if(start_time[i] + running_time[i] <= start_time[i+1]){
					start.add(start_time[i]);
					running.add(running_time[i]);
				} else {
					if(start_time[i] + running_time[i] <= start_time[i+1] + running_time[i+1]) {
						start.add(start_time[i]);
						running.add(running_time[i]);
					} else {
						start.add(start_time[i+1]);
						running.add(running_time[i+1]);
					}
					i++;
				}
			} else {
				if(start.get(start.size()-1) + running.get(running.size()-1) <= start_time[i]) {
					start.add(start_time[i]);
					running.add(running_time[i]);
				} else {
					if(start.get(start.size()-1) + running.get(running.size()-1) > start_time[i+1] + running_time[i+1]) {
						start.set(start.size()-1 , start_time[i]);
						running.set(running.size()-1 ,running_time[i]);
					} 
				}
			}
		}
		return start.size();
	}
}