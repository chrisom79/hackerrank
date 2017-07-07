package hackerrank;

import java.util.Scanner;

public class StrangeCode {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long prev = 3;
        while(t > prev) {
        	t -= prev;
        	prev *= 2;
        }
        prev = prev - t + 1;
        System.out.println(prev);
	}

}
