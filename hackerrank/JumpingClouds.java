package hackerrank;

import java.util.Scanner;

public class JumpingClouds {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jump = 0;
        int E = 100;
        do {
        	jump += k;
        	E -= 1;
        	
        	if(jump >= n) 
        		jump -= n;  
        	
        	if(jump != 0 && c[jump] == 1)
        		E -= 2;
        	        		
        } while(jump != 0);
        
        if(c[jump] == 1)
    		E -= 2;
        
        System.out.println(E);
    }
}
