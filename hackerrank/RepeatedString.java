package hackerrank;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        int numberA = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'a') {
        		numberA++;
        	}
        }
        
        long divided = n / s.length();
        long module = n % s.length();
        long countA = divided * numberA;
        
    	for(int i = 0; i < module; i++) {
        	if(s.charAt(i) == 'a') {            		
        		countA++;
        		
        	}
        
        }
        
        
        System.out.println(countA);
    }
}
