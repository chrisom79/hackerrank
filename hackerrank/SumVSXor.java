package hackerrank;

import java.util.Scanner;

public class SumVSXor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        String bits = Long.toBinaryString(n);
        System.out.println(bits);
        int o = 0;
        int z = 0;
        for(int i = 0; i < bits.length(); i++) {
        	if(bits.charAt(i) == '1') {
        		o++;
        	} else {
        		z++;
        	}
        	
        }
        long c = 0;
        if(o == 0) {
        	c = 1;
        } else {
        	c = (long) Math.pow(2, z);
        }
        
        System.out.println(c);
	}

}