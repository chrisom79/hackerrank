package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HappyLadybugs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        
        
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            
            if(b.isEmpty() || (b.length() == 1 && b.charAt(0) == '_')) {
            	 System.out.println("YES");
            } else if(b.matches("((\\w)(\\2+))+") && !b.contains("_")) {
            	System.out.println("YES");
        	} else if(!b.matches("((\\w)(\\2+))+") && !b.contains("_")) {
        		System.out.println("NO");
        	} else {
            		List<Character> stack = new ArrayList<Character>();
            		List<Character> back = new ArrayList<Character>();
            		for(int i = 0; i < n; i++) {
            			char c = b.charAt(i);
            			
            			if(!stack.contains(c) && !back.contains(c)) {
            				stack.add(c);
            			} else {
            				if(c != '_' && stack.contains(c))
            					stack.remove(stack.indexOf(c));
            				back.add(c);
            			}
            
            		}
            		System.out.println(stack.size() > 1?"NO":"YES");
            }
            
            
        }

	}

}
