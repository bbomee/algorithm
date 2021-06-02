package leetCode;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortList {

	public static void main(String[] args) {
		ListNode list = new ListNode(4);
		ListNode head = list;
		list.next = new ListNode(2);
		list.next.next = new ListNode(1);
		list.next.next.next = new ListNode(3);
		
		/*ListNode result = insertionSortList(head);
		
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}*/
		
		int[] wrong = {4,19,14,5,-3,1,8,5,11,15};
		insertSort(wrong);
		
	}
	
    public static ListNode insertionSortList(ListNode head) {
        List list = new ArrayList<>();
        while(head != null) {
        	list.add(head.val);
        	head = head.next;
        }
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++) {
        	arr[i] = (int) list.get(i);
        }
        insertSort(arr);
        
        ListNode result = new ListNode();
        ListNode rh = result;
        for(int i = 0 ; i < arr.length; i++) {
        	result.val = arr[i];
        	if(i != arr.length-1) {
        		result.next = new ListNode();
        	}
        	result = result.next;
        }
        
       /* while(rh != null) {
        	System.out.println(rh.val);
        	rh = rh.next;
        }*/
        
        return rh;
    }
    
    public static int[] insertSort(int[] arr) {
    	for(int i = 0; i <arr.length-1; i++) {
    			int temp = arr[i+1];
    			int j;
    			System.out.println("temp: " + temp);
    		for(j = i; j >= 0; j--) {
    			if(arr[j] > temp) {
    				arr[j+1] = arr[j];
    			} else{
    				break;
    			}
    		}

			arr[j+1] = temp;
    		for(int k = 0 ; k < arr.length; k++) {
    			System.out.print(arr[k] + " ");
    		}
    		System.out.println();
    	}
    	
    	return arr;
    }

}
