package boostcamp;

public class test2 {

	public static void main(String[] args) {
		String[] memory = {"FLOAT","SHORT", "BOOL", "BOOL","BOOL", "LONG", "LONG", "LONG", "LONG", "LONG", "LONG", "LONG"}; 
		System.out.println(Solution(memory));
	}
	
	public static String Solution(String[] memory) {
		String answer = "";
		String[] temp = new String[memory.length];
		int longCnt = 0;
		
		for(int i = 0; i < memory.length; i++) {
			if(memory[i].equals("LONG")) {
				longCnt++;
				temp[i] = "########,########";
			} else if(memory[i].equals("INT")) {
				temp[i] = "########";
			} else if(memory[i].equals("FLOAT")) {
				temp[i] = "####";
			} else if(memory[i].equals("SHORT")) {
				temp[i] = "##";
			} else {
				temp[i] = "#";
			}
		}
		
		if((128 - 16*longCnt)/8 < memory.length - longCnt) {
			return "HALT";
		} else {
			String s = "";
			for(int i = 0; i < temp.length; i++) {
				if(s.length() == 0) {
					s += temp[i];
				} else if(s.length() >= 8) {
					answer += s+",";
					s = temp[i];
				} else if(s.length() < temp[i].length()) {
					int last = 0;
					if(temp[i].length() > 8) last = 8-s.length();
					else last = temp[i].length()-s.length();
					
					for(int j = 0; j < last; j++) {
						s += ".";
					}
					if(s.length() == 8) {
						answer += s+",";
						s = "";
					}
					s += temp[i];
				} else {
					s += temp[i];
				}
			}
			
			if(s.length() < 8) {
				int last = 8-s.length();
				for(int i = 0; i < last; i++) {
					s += ".";
				}
			}
			answer += s;
			
		}
		return answer;
	}
}