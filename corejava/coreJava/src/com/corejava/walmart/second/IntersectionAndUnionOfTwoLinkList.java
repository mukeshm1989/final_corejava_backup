package com.corejava.walmart.second;

public class IntersectionAndUnionOfTwoLinkList {
	Node head;
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	void getUnion(Node head1, Node head2) {
		Node t1 = head1, t2 = head2;
		while (t1 != null) {
			push(t1.data);
			t1 = t1.next;
		}
		while (t2 != null) {
			if (!isPresent(head, t2.data))
				push(t2.data);
			t2 = t2.next;
		}
	}

	void getIntersection(Node head1, Node head2) {
		Node result = null;
		Node t1 = head1;
		while (t1 != null) {
			if (isPresent(head2, t1.data))
				push(t1.data);
			t1 = t1.next;
		}
	}
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	boolean isPresent(Node head, int data) {
		Node t = head;
		while (t != null) {
			if (t.data == data)
				return true;
			t = t.next;
		}
		return false;
	}

	/* Utility function to print list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	/* Driver program to test above functions */
	public static void main(String args[]) {
		IntersectionAndUnionOfTwoLinkList llist1 = new IntersectionAndUnionOfTwoLinkList();
		IntersectionAndUnionOfTwoLinkList llist2 = new IntersectionAndUnionOfTwoLinkList();
		IntersectionAndUnionOfTwoLinkList unin = new IntersectionAndUnionOfTwoLinkList();
		IntersectionAndUnionOfTwoLinkList intersecn = new IntersectionAndUnionOfTwoLinkList();

		/* create a linked lists 10->15->4->20 */
		llist1.push(20);
		llist1.push(4);
		llist1.push(15);
		llist1.push(10);

		/* create a linked lists 8->4->2->10 */
		llist2.push(10);
		llist2.push(2);
		llist2.push(4);
		llist2.push(8);

		intersecn.getIntersection(llist1.head, llist2.head);
		unin.getUnion(llist1.head, llist2.head);

		System.out.println("First List is");
		llist1.printList();

		System.out.println("Second List is");
		llist2.printList();

		System.out.println("Intersection List is");
		intersecn.printList();

		System.out.println("Union List is");
		unin.printList();
	}
}
