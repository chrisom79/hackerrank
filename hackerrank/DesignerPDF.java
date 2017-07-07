package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDF {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        
        String word = in.next();
        int max = 1;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int i=0;
        for(char ch='a';ch<='z';ch++) {
             map.put(ch,h[i]);
             i++;
        }
        
        for(int h_i=0; h_i < word.length(); h_i++) {
        	if(max < map.get(word.charAt(h_i))) {
        		max = map.get(word.charAt(h_i));
        	}
        }
        
        System.out.println(max * word.length());
    }
}
