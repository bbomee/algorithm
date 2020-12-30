package leetCode;

import java.util.ArrayList;


public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {""};
		System.out.println(longestCommonPrefix(strs));

	}

	public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) {
			return strs[0];
		}
		strs = ascArray(strs);
		//System.out.println(strs[0] + " " + strs[1] + " " + strs[2]);
		ArrayList<String> resultList = new ArrayList();

		//두개의 공통 string을 반환해주는 ArrayList를 이용하자!
		for(int i = 0; i < strs.length; i++) {
			if(i==0) {
				resultList = commonList(strs[i], strs[i+1]);
				i++;
				//resultList에는 flow가 들어있음
			} else {
				for(int j = 0; j < resultList.size(); j++) {//j=0일떄 fl, j=1일때 er
					if(!strs[i].contains(resultList.get(j))) {
						resultList.remove(j);
						j--;
					}
				}
			}
			
		}
		if(resultList.size() == 0) {
			return "";
		}
		
		return resultList.get(0);
	}

	public static String[] ascArray(String[] strs) {
		for(int i = 0; i < strs.length-1; i++) {
			if(strs[i+1].length() < strs[i].length()) {
				String temp = strs[i];
				strs[i] = strs[i+1];
				strs[i+1] = temp;
			}
		}
		return strs;
	}

	public static ArrayList<String> commonList(String shortS, String longS){
		ArrayList al = new ArrayList(); //공통된걸 담은 ArrayList

		for(int i = 0; i < shortS.length(); i++) {
			for(int j = 0; j < i+1; j++) {
                String result = "";
				for(int k = j; k < shortS.length()-i+j; k++) {
					result = result + shortS.charAt(k); //sh[k];
				}
				if(longS.contains(result)) {
					al.add(result);
				}
			}
			
		}
		return al;
	}

}
