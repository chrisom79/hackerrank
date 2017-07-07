package hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FatlandSpaceStations {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
                
        int max = 0;
        for(int mv = 0; mv < n; mv++) {
        	int min = Math.abs(mv - c[0]);
        	for(int c_i=0; c_i < m; c_i++) {
        		min = Math.min(min, Math.abs(c[c_i] - mv));
        	}
        	
        	max = Math.max(max, min);
        }
        
        System.out.println(max);
    }
}
