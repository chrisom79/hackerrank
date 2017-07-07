package datastructures;

import java.util.Scanner;

import datastructures.PrintLinkedList.Node;

public class InsertNodeTail {
	
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
	    } else {
	        Node node = head;
	        while (node.next != null){
	            node = node.next;
	        }
	        node.next = new Node();
	        node.next.data = data;
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
		InsertNodeTail items = new InsertNodeTail();
		Node head =  null;
		while( i < array.length) {
			head =  items.Insert(head, Integer.valueOf(array[i]));
			i++;
		}
		
		print(head);
				
	}
}
