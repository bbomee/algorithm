package leetCode;

import java.util.ArrayList;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode resultNode = new ListNode();
		//[1,2,4]
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(2, node1);
		ListNode node3 = new ListNode(1, node2);

		//[1,3,4]
		ListNode nodeA = new ListNode(4);
		ListNode nodeB = new ListNode(3, nodeA);
		ListNode nodeC = new ListNode(1, nodeB); 

		resultNode = mergeTwoLists(node3, nodeC);
		
		while(resultNode != null) {
			System.out.println(resultNode.val);
			resultNode = resultNode.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;	
		while(l1 != null || l2 != null) {
			if(l1 == null) {
				result = makeNewNode(result, l2.val);
				l2 = l2.next;
			} else if(l2 == null) {
				result = makeNewNode(result, l1.val);
				l1 = l1.next;
			} else if(l1.val <= l2.val) {
				result = makeNewNode(result, l1.val);
				l1 = l1.next;
			} else {
				result = makeNewNode(result, l2.val);
				l2 = l2.next;
			}
		}
		return result;
    }
	
	public static ListNode makeNewNode(ListNode result, int val) {
		ListNode n = new ListNode(val);
		if(result == null) {
			result = n;
		} else {
			ListNode head = result;
			while(head.next != null) {
				head = head.next;
			}
			head.next = new ListNode(val);
		}
		return result;
	}
}
