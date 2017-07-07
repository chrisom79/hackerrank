package hackerrank;

import java.util.Scanner;

public class AbsolutePermutation {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            perm(n, k);
        }
    }
	
	public static void perm(int n, int k) {
        int[] a = new int[n];
        boolean match = true;
        for (int i = 1; i <= n; i++) {
            a[i - 1] = i;
            
            if(Math.abs(a[i - 1] - i) != k) {
            	match = false;            	
            }
        }
        
        while (!match && hasNext(a)) {
        	match = true;
        	
        	for (int i = 1; i <= n; i++) {
                if(Math.abs(a[i - 1] - i) != k) {
                	match = false;
                	break;
                }
            }
        }
        
        if(match) {
        	show(a);
        } else {
        	System.out.println("-1");
        }
           
    }
	
	public static void show(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
	
	public static boolean hasNext(int[] a) {
        int n = a.length;

        int k; 
        for (k = n-2; k >= 0; k--)
            if (a[k] < a[k+1]) break;
        if (k == -1) return false;

        int j = n-1;
        while (a[k] > a[j])
            j--;
        swap(a, j, k);

        for (int r = n-1, s = k+1; r > s; r--, s++)
            swap(a, r, s);

        return true;
    }
	 
	public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
	 
}
