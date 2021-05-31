package algorithm;

import java.util.ArrayList;
import java.util.List;

public class combination {

	public static void main(String[] args) {
		int n = 4;
		int r = 2;
		List<List<Integer>> result = combine(n, r);
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		
	}
	
	public static List<List<Integer>> combine(int n, int r) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combination(result, temp, n, 0, r);
        return result;
    }
	
	public static void combination(List<List<Integer>> result, List<Integer> temp, int n, int k, int r) {
		if(temp.size() == r) {
			List<Integer> t = new ArrayList<>();
			for(int i = 0; i < temp.size(); i++) {
				t.add(temp.get(i));
			}
			result.add(t);
			return;
		} else {
			if(k == n) return;
			
			temp.add(k+1);
			combination(result, temp, n, k, r); //k+1 하면 중복조합 제외
			
			temp.remove(temp.size()-1);
			combination(result, temp, n, k+1, r);
		}
	}

}
