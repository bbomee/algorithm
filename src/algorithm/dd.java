package algorithm;

import java.util.*;
public class dd {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		temp.add(1);
		temp.add(2);
		list.add(temp);
		
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		
		System.out.println(list.get(0).equals(a));
	}

}
