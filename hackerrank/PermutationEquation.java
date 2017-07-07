package hackerrank;

import java.util.Scanner;

public class PermutationEquation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++){
			p[in.nextInt() - 1] = i;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(search(p, i));
		}
	}
	
	public static int search(int[] p,int val){
	    int x = p[val];
	    int y = p[x];
	    
	    return y + 1;
	}
    
}
