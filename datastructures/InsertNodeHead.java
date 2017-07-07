package datastructures;

import java.util.Scanner;

import datastructures.InsertNodeTail.Node;

public class InsertNodeHead {
	public class Node {
		private int data;
		private Node next;
		
		
		
		public Node() {
			super();			
		}		
	}
	
	Node Insert(Node head,int data) {
		if (head == null){
	        head = new Node();
	        head.data = data;
	    }
	    else {	        
	        Node newN = new Node();
	        newN.next = head;
	        newN.data = data;
	        head = newN;
	    }
	    return head;
	}
	
	Node InsertNth(Node head, int data, int position) {
		if (head == null){
	        head = new Node();
	        head.data = data;
	    }
		return head; 
	}
	
	static void print(Node head) {
		while(head != null) { 
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String ll = in.next();
		String[] array = ll.split("->");
		int  i = 0;	
		InsertNodeHead items = new InsertNodeHead();
		Node head =  null;
		while( i < array.length) {
			head =  items.Insert(head, Integer.valueOf(array[i]));
			i++;
		}
		
		print(head);
				
	}
}
