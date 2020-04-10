package leetcodemedium;

import leetcodemedium.AddTwoNumbers.ListNode;

public class AddTwoNumbers {
	
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode res = null,prev = null;
		int sum, carry = 0;
		while(l1 != null || l2 != null) {
			
			System.out.println("Adding l1.val - " + l1.val + " and l2.val - " + l2.val);
			sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
			
			System.out.println("Sum : " + sum);
			
			carry = sum >= 10 ? 1 : 0;
			
			System.out.println("Carry : " + carry);
			sum = sum % 10;
			
			ListNode temp = new ListNode(sum);

			System.out.println("Before if");
			System.out.println("Print res :");
			print(res);
			System.out.println("Print prev :");
			print(prev);
			
			if(res == null) {
				res = temp;
			}else {
				prev.next = temp;
			}
			
			prev = temp;
			
			System.out.println("After if");
			System.out.println("Print res :");
			print(res);
			System.out.println("Print prev :");
			print(prev);
			
			if(l1 != null) {
				l1 = l1.next;
			}
			if(l2 != null) {
				l2 = l2.next;
			}
			
			if(carry > 0) {
				temp.next = new ListNode(carry);
			}
			
			System.out.println("At end temp");
			print(temp);
		}
		
        return res;
    }
	
	public static void print(ListNode node) {
		if(node == null) {
			return;
		}
		while(node != null) {
			System.out.print(node.val + " -> ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		addTwoNumbers(l1, l2);
	}
}
