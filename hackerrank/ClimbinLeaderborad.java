package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ClimbinLeaderborad {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int pos = 0;
        for(int scores_i = 0; scores_i < n; scores_i++) {
            if (pos == 0) {
                scores[pos] = in.nextInt();
                pos++;
            } else {
                int temp = in.nextInt();
                if (temp != scores[pos-1]) {
                    scores[pos] = temp;
                    pos++;
                }
            }
        }
        
        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        
        int k = 0; 
        int i = pos - 1;
        while (k != alice.length) {
            if (alice[k] < scores[i]) {
                System.out.println(i+2);
                k++;
            } else if (alice[k] == scores[i]) {
                System.out.println(i+1);
                k++;
            } else if (alice[k] > scores[i]) {
                if (i == 0) {
                    System.out.println(i + 1);
                    k++;
                } else {
                    i--;
                }
            }
        }
	}
		
}

