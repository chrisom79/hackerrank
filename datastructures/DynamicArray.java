package datastructures;

import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		int last = 0;
		int [][]seq = new int[N][0];
		
		for(int i = 0; i < Q; i++) {
			int qry = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			
			if(qry == 1) {
				seq[(x ^ last) % N] = append(seq[(x ^ last) % N], y); 
			} else if (qry == 2) {
				last = seq[(x ^ last) % N][y % seq[(x ^ last) % N].length];
				System.out.println(last);
			}
		}
	}
	
	private static int[] append(int[] array, int value) {
		int[] ret = new int[array.length + 1];
		
		for(int i = 0; i < array.length;  i++) {
			ret[i] = array[i];
		}
		ret[array.length] = value;
		
		return ret;
	}
}
