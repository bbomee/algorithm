package programmers;

import java.util.HashSet;

public class 방문길이 {

	public static void main(String[] args) {
		String dirs = "LULLLLLLU";
		System.out.println(solution(dirs));
	}
	
	public static int solution(String dirs) {
        int answer = 0;
        int[] dx = {0,0,-1,1}; //상하좌우
        int[] dy = {1,-1,0,0};
        int x = 0;
        int y = 0;
        int nx = 0;
        int ny = 0;
        HashSet<String> hs = new HashSet<>();
        char[] cArr = dirs.toCharArray();
        
        for(int i = 0; i < cArr.length; i++) {
        	if(isField(x+dx[0], y+dy[0]) && cArr[i] == 'U') {
        		nx = x+dx[0];
        		ny = y+dy[0];
        	} else if(isField(x+dx[1], y+dy[1]) && cArr[i] == 'D') {
        		nx = x+dx[1];
        		ny = y+dy[1];
        	} else if(isField(x+dx[2], y+dy[2]) && cArr[i] == 'L') {
        		nx = x+dx[2];
        		ny = y+dy[2];
        	} else if(isField(x+dx[3], y+dy[3]) && cArr[i] == 'R'){
        		nx = x+dx[3];
        		ny = y+dy[3];
        	}
        	
        	if(!(x == nx && y == ny)) {
        		String s1 = x+""+y+nx+""+ny;
            	String s2 = nx+""+ny+x+""+y;
            	
            	if(!hs.contains(s1) && !hs.contains(s2)) {
            		hs.add(s1);
            		hs.add(s2);
            		answer++;
            	}
            	x = nx;
            	y = ny;
        	}
        	
        }
        return answer;
    }
	
	public static boolean isField(int x, int y) {
		if(x == -6 || y == -6) return false;
		if(x == 6 || y == 6) return false;
		return true;
	}

}
