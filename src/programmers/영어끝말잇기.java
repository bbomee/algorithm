package programmers;

import java.util.HashSet;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] answer = solution(n,words);
		System.out.println(answer[0] + " " + answer[1]);
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet h = new HashSet<>();
        h.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
        	char last = words[i-1].charAt(words[i-1].length()-1);
        	char curr = words[i].charAt(0);
        	
        	if(h.contains(words[i]) || last != curr) {
        			answer[0] = i%n+1;
            		answer[1] = i/n+1;
        		return answer;
        	}
        	h.add(words[i]);
        }
        //지금 단어가 지금까지 잇는 단어에 있는 확인 + 그 전 단어의 끝자로 시작하는지 확인 아닐시 해당 인덱스 / 사람 수의 몫, 나머지 !가 답
        return answer;
    }

}
