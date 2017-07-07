package hackerrank;

import java.util.Scanner;

public class ReduceString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();		
		int idx = 0;
		do {
			char c = s.charAt(idx);
			String repeated = new StringBuilder().append(c).append(c).toString();
			if(s.contains(repeated)) {				
				s = s.replace(repeated, "");
				idx = 0;
			} else {
				idx++;
			}
		} while(idx != s.length() && !s.isEmpty());
		
		System.out.println(s.isEmpty()?"Empty String":s);
    }
}
