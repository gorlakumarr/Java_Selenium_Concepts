package collections;

public class List_MyLinkedList {

	/**
	 * Linked List : Implements List, Dequeue (itself ) extends Queue
	 * 
	 * Singly Linked List :: Doubly Linked List
	 * 
	 * 
	 * Contigious Memory Allocation. Drawback here is Shifting takes too much time
	 * 
	 * Forward Direction Only
	 * 
	 */
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void printMyLL() {
		Node n = head;

		while (n != null) {
			System.out.println(n.data);
			System.out.println(n.next);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		List_MyLinkedList ll = new List_MyLinkedList();
		Node first = ll.new Node(10);
		ll.head = first;

		Node second = ll.new Node(20);
		first.next = second;

		Node third = ll.new Node(30);
		second.next = third;

		ll.printMyLL();
	}
}
