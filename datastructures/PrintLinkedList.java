package datastructures;

import java.util.Scanner;

public class PrintLinkedList {
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String ll = in.next();
		String[] array = ll.split("->");
		int  i = 0;
		PrintLinkedList items = new PrintLinkedList();
		while(!array[i].equals("NULL")) {
			items.insert(Integer.valueOf(array[i]));
			i++;
		}
		
		Print(first);
	}
	
	public class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			super();
			this.data = data;
		}

		public int getData() {
			return data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	
	private static Node first;
	private static Node pivote;
	
	public PrintLinkedList() {
		super();
		this.first = null;
	}

	void insert(int data) {
		Node node = new Node(data);
		node.next = first;
		first = node;
	}
	
	static void Print(Node head) {
		while(head != null) { 
			System.out.println(head.data);
			head = head.next;
		}
	}
}
