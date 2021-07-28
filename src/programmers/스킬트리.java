package programmers;

public class 스킬트리 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution(skill, skill_trees));
	}
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0; i < skill_trees.length; i++) {
        	String[] skills = skill_trees[i].split(""); //b, a, c, d,e담김
        	String str = "";
        	for(int j = 0; j < skills.length; j++) {
        		if(skill.contains(skills[j])) {
        			str += skills[j]+"";
        		} 
        	}
        	
        	String result = skill.substring(0, str.length());
        	if(result.equals(str)) answer++;

        }
        return answer;
    }

}
