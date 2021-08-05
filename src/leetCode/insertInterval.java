package leetCode;

import java.util.ArrayList;

public class insertInterval {

	public static void main(String[] args) {
		int[][] intervals = {{1,3},{6,9}};
		int[] newInterval = {2,5};
		insert(intervals, newInterval);
	}
	
	public static int[][] insert(int[][] intervals, int[] newInterval) {
		if(intervals.length == 0) {
			int[][] result = new int[1][2];
			result[0] = newInterval;
			return result;
		}
        int[]result = new int[2];
    	int size = 0;
    	//newInterval이 맨 앞이거나 맨 뒤일때
    	if(newInterval[1] < intervals[0][0] || newInterval[0] > intervals[intervals.length-1][1]) {
    		result = newInterval;
    	} else {       	
        	//newInterval이 중간에 있을때
            //result[0]
    		for(int i = 0; i < intervals.length; i++) {
            	//result[0]이 맨 앞일떄
            	if(newInterval[0] < intervals[0][0]) {
            		result[0] = newInterval[0];
            		break;
            	} //result[0]이 중간이고 배열 안에 있을때 
            	else if(newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1]) {
            		result[0] = intervals[i][0];
            		break;
            		//result[0]이 중간이고 배열 밖에 있을때
            	} else if(newInterval[0] > intervals[i][1]) {
            		result[0] = newInterval[0];
            	} 
            }
    		//result[1]
    		for(int i = 0; i < intervals.length; i++) {
    			//result[1]이 중간이고 배열 안에 있을떄0
    			if(newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1]) {
    				result[1] = intervals[i][1];
    				break;
    			} else if(newInterval[1] > intervals[i][1]) {
    				result[1] = newInterval[1];
    			}
    		}
            
    	}
    	
    	ArrayList resultList = new ArrayList();
    	//한 번 넣어주면 안넣음
    	boolean push = false;
    	//겹친 숫자 몇갠지
    	for(int i = 0 ; i < intervals.length; i++) {
    		if(result[0] <= intervals[i][0] && result[1] >= intervals[i][1])
    			size++;
    	}
    	// 앞에 위치할때 더하기
    	if(result[1] < intervals[0][0]) {
			resultList.add(result);
		}
    	
    	if(size == 0) {
    		for(int i = 0; i < intervals.length-1; i++) {
    			if(result[0] > intervals[i][1] && result[1] < intervals[i+1][0]) {
    				resultList.add(result);
    			}
    		}
    	} 
	    	for(int i = 0; i < intervals.length; i++) {
	    		if(!(result[0] <= intervals[i][0] && result[1] >= intervals[i][1])) {
	    			resultList.add(intervals[i]);
	    		}else if(!push) {
	    			resultList.add(result);
	    			push = true;
	    		}
	    	}
    	
    	if(result[0] > intervals[intervals.length-1][1]) {
 			resultList.add(result);
 		} 

    		int[][] resultArray = new int[resultList.size()][2];
    	for(int i = 0; i < resultList.size(); i++) {
    		resultArray[i] = (int[]) resultList.get(i);
    	}
    	
    	for(int i = 0 ; i < resultArray.length-1; i++) {
    		int[] temp = resultArray[i];
    		if(resultArray[i][0] > resultArray[i+1][0]) {
    			resultArray[i] = resultArray[i+1];
    			resultArray[i+1] = temp;
    		}
    	}
        return resultArray;
    }
}
