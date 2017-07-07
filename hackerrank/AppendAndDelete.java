package hackerrank;

import java.util.Scanner;

public class AppendAndDelete {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        
        int count = 0;
        int minlength = Math.min(s.length(), t.length());
        for(int i = 0; i < minlength; i++) {
	        if(s.charAt(i) == t.charAt(i))
	        	count++;
	        else 
	        	break;
        }
        
        if(((s.length() + t.length() - (2 * count)) > k)) {
        	System.out.println("No");
        } else if(((s.length() + t.length() - (2 * count)) % 2 == k % 2) || (s.length() + t.length() - k) < 0) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}
