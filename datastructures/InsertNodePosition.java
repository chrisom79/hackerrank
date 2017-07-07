package datastructures;

import java.util.Scanner;

import datastructures.InsertNodeHead.Node;

public class InsertNodePosition {
	public class Node {
		private int data;
		private Node next;
		
		public Node() {
			super();			
		}		
	}
	
	Node InsertNth(Node head, int data, int position) {
		Node node = head;
		Node mid = new Node();
		mid.data = data;
		
		if (head == null){
	        return mid;
	    } 
		
		if(position == 0 ) {
			mid.next = head;
			return mid;
		}
		
		int mov = 0;
	    
        while (node.next != null && mov < position - 1){
        	head = head.next;            
            mov++;
        }
        
        Node nodePos = head.next;
        head.next = mid;
		head = head.next;
		head.next = nodePos;
		
		return node; 
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
		InsertNodePosition items = new InsertNodePosition();
		Node head =  null;
		while( i < array.length) {
			String[] val = array[i].split(",");
			head =  items.InsertNth(head, Integer.valueOf(val[0]), Integer.valueOf(val[1]));
			i++;
		}
		
		print(head);
				
	}
}
