package programmers;

import java.util.Arrays;

public class retiredCompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		Arrays.sort(participant);
		Arrays.sort(completion);
		String failer = "";
		for(int i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				failer = participant[i];
			}
		}
		if(failer.equals("")) {
			failer = participant[participant.length-1];
		}
		
		System.out.println(failer);
	}

}
