package leetCode;

import java.util.ArrayList;

public class AddTwoNumbers {
	public static void main(String[] args) {
	  ListNode resultNode = new ListNode();
	  //[2,4,3]
      ListNode node1 = new ListNode(3);
      ListNode node2 = new ListNode(4, node1);
      ListNode node3 = new ListNode(2, node2);
      
      //[5,6,4]
      ListNode nodeA = new ListNode(4);
      ListNode nodeB = new ListNode(6, nodeA);
      ListNode nodeC = new ListNode(5, nodeB); 
      
      resultNode = addTwoNumbers(node3, nodeC);

	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //ArrayList 생성
        ArrayList<Integer> arrList1 = makeArrList(l1);
        ArrayList<Integer> arrList2 = makeArrList(l2);
        
        //ArrayList 더함
        ArrayList<Integer> sumResult = new ArrayList<>();
        if(arrList1.size() >= arrList2.size()) {
            sumResult = sumArrList(arrList1, arrList2);
        } else { 
            sumResult = sumArrList(arrList2, arrList1);   
        }
        
       /* for(int i = 0 ; i < sumResult.size(); i++) {
        	System.out.println(sumResult.get(i));
        }
        */
        
        // List를 ListNode로 변환
        ListNode result = listToNode(sumResult);
        while(result != null) {
        	System.out.println(result.val);
        	result = result.next;
        }
        
        
        return l1;
    
    }
    
    //ListNode를 ArrayList로 변환하는 메소드
    public static ArrayList<Integer> makeArrList(ListNode ln) {
        ArrayList<Integer> arrList = new ArrayList<>();
        while(ln != null) {
            arrList.add(ln.val);
            ln = ln.next;
        }
        return arrList;
    }
    
    //두개의 ArrayList를 더한 ArrayList를 반환하는 메소드
    public static ArrayList<Integer> sumArrList(ArrayList<Integer> longList, ArrayList<Integer> shortList) {
        ArrayList<Integer> sumResult = new ArrayList<>();
        int temp = 0;
        int sum = 0;
        
        //짧은List값까지 짧은List + 긴List;
        for(int i = 0; i < shortList.size(); i++) {
                sum = temp + longList.get(i) + shortList.get(i);
                if(sum >=10) {
                    sumResult.add(sum - 10);
                    temp = 1;
                } else {
                    sumResult.add(sum);
                    temp = 0;
            }
        }
        
        //짧은List이후 값부터는 LongList + temp;
        for(int i = shortList.size(); i < longList.size(); i++) {
            sum = temp + longList.get(i);
            if(sum >=10) {
                    sumResult.add(sum - 10);
                    temp = 1;
                } else {
                    sumResult.add(sum);
                    temp = 0;
                }
        }
        
        //마지막 값 더해서 10넘으면 자리올림수~
        if(temp == 1) {
        	sumResult.add(temp);
        }
        return sumResult;
    }
    
    public static ListNode listToNode(ArrayList<Integer> al) {
    	ListNode result = new ListNode();
    	ListNode head = new ListNode();
    	
    	for(int i = 0; i < al.size(); i++) {
    		if(i==0) {
    			result.val = al.get(i);
    			head = result;
    		} else {
    			ListNode n = new ListNode(al.get(i));
    			head.next = n;
    			head = n;
    		}
    	}
    	return result;
    }

}
