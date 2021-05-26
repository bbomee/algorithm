package naverFinancial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test4 {

	public static void main(String[] args) {
		int inner = 2;
		int outer = 4;
		int[] points_x = {4, 0, 1, -2};
		int[] points_y = {-4, 4, 3, 0};
		double result = Math.sqrt(25); //25의 제곱근
        
		Map<String, List<String>> a = new HashMap<>();
		if(a.get("s") == null) {
			System.out.println("없음");
			List<String> list = new ArrayList<>();
			a.put("s", list);
		}
		a.get("s").add("sting");
		System.out.println(a.get("s"));
		//System.out.println(solution(inner, outer, points_x, points_y));

	}
	
	static int solution(int inner, int outer, int[] points_x, int[] points_y) {
		int cnt = 0;
		
		for(int i = 0; i < points_x.length; i++) {
			int x = points_x[i];
			int y = points_y[i];
			
			double len = Math.sqrt(x*x + y*y);
			if(len > inner && len < outer) {
				cnt++;
			}
		}
        
        return cnt;
    }

}
