package datastructures;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] rot = new int[n];
		int idx = 0;
		for(int i = 0; i < n; i++) {
			if(d > i) {
				idx =  n - (d - i);
			} else {
				idx = i - d;
			}
			
			rot[idx] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(rot[i] + " ");
		}
	}
}
