package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMICPCTeam {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
	    List<String> members = new ArrayList<String>(n);

	    for (int i = 0; i < n; i++) {
	    	members.add(in.next());
	    }

	    int max = Integer.MIN_VALUE;
	    int nt = 0; 
	    int n_ones = 0;
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (members.get(i).equals(members.get(j)))
	                continue;
	            else {
	                n_ones = 0;
	                for (int k = 0; k < m; k++) {
	                    int A = Character.getNumericValue(members.get(i).charAt(k));
	                    int B = Character.getNumericValue(members.get(j).charAt(k));
	                    if ((A | B) == 1) {
	                        n_ones++;
	                    }
	                }
	                if (max < n_ones) {
	                    max = n_ones;
	                    nt = 1;
	                } else if (max==n_ones){
	                	nt++;
	                }
	            }
	        }
	    }

	    System.out.println(max);
	    System.out.println(nt);

	}
}
