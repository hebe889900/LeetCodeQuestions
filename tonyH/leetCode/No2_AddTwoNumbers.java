package com.tony.testAlgorithms;

import org.junit.Test;

import leetCode.defaultClasses.No2_ListNode;

public class No2_AddTwoNumbers {

	@Test
	public void solution() {

		No2_ListNode n1 = new No2_ListNode(5);
//		n1.next = new No2_ListNode(4);
//		n1.next.next = new No2_ListNode(3);

		No2_ListNode n2 = new No2_ListNode(5);
//		n2.next = new No2_ListNode(6);
//		n2.next.next = new No2_ListNode(4);
		// n2.next.next.next = new No2_ListNode(6);
		// n2.next.next.next.next = new No2_ListNode(10);
		// n2.next.next.next.next.next = new No2_ListNode(9);

		No2_ListNode solution = addTwoNumbers(n1, n2);
		System.out.println(solution);
	}

	No2_ListNode addTwoNumbers(No2_ListNode node1, No2_ListNode node2) {

		No2_ListNode solution = new No2_ListNode(0);
		No2_ListNode tempNode = solution;
		int sum = -1;
		int rest = -1;

		while (node1 != null || node2 != null) {

			if (node1 == null) {

				sum = node2.val;
				node2 = node2.next;

			} else if (node2 == null) {
				sum = node1.val;
				node1 = node1.next;
			} else {
				sum = node1.val + node2.val;
				node1 = node1.next;
				node2 = node2.next;
			}
			if (rest == 1) {
				tempNode.next = new No2_ListNode(sum + 1);
			} else {
				tempNode.next = new No2_ListNode(sum);
			}
			if (sum >= 10) {
				sum -= 10;
				tempNode.next = new No2_ListNode(sum);
				rest = 1;
			}

			tempNode = tempNode.next;

		}
		
		if(rest == 1){
			tempNode.next = new No2_ListNode(1);
		}
		

		return solution.next;
	}

}
