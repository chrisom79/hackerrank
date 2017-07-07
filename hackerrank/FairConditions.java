package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FairConditions {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        
        int bread = 0;
        for(int B_i=0; B_i < N; B_i++) {
        	if(B[B_i] % 2 == 1) {
        		B[B_i]++;
        		bread++;
        		int r = 0;
        		int l = 0;
        		if(B_i + 1 < N)
        			r = B[B_i + 1] + 1;
        		if(B_i - 1 > 0)
        			l = B[B_i - 1] + 1;
        		
        		if(r != 0 && r % 2 == 0 && r <= l)
        			B[B_i + 1]++;
        		else if(l != 0 && l % 2 == 0 && l < r)
        			B[B_i - 1]++;
        		else if(B_i + 1 < N)
        			B[B_i + 1]++;
        		else
        			B[B_i - 1]++;
        		bread++;
        	}
        }
        
        boolean fair = true;
        for(int B_i=0; B_i < N; B_i++) 
        	if(B[B_i] % 2 == 1) 
        		fair = false;
        
        System.out.println(fair?bread:"NO");
    }
}
