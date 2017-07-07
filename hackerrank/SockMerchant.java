package hackerrank;

import java.util.Scanner;

public class SockMerchant {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        boolean[] matches = new boolean[n];
        int number = 0;
        for(int i = 0; i < n; i++) {
        	for(int j =  i + 1; j < n; j++) {
        		if(c[i] == c[j] && !matches[i] && !matches[j]) {
        			number++;
        			matches[i] = true;
        			matches[j] = true;
        		}
        	}
        }
        
        System.out.println(number);
    }
}
