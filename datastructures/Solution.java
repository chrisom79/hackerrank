package datastructures;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		//String[] blocks = {"5", "-2", "4", "Z", "X", "9", "+", "+"};
		String[] blocks = {"1", "2", "+", "4"};
		int n = 4;
		int total = totalScore(blocks, 8);
		System.out.println(total);
	}
	
	public static int totalScore(String[] blocks, int n)
    {
        List<String> letters = Arrays.asList("X", "Z", "+");
		int sum = 0;
		for(int i = 0; i < n; i++) {
            if("X".equals(blocks[i])) {
            	if(!letters.contains(blocks[i -1]))
            		blocks[i] = String.valueOf(Integer.valueOf(blocks[i - 1]) * 2);                
            } else if("+".equals(blocks[i])) {
            	if(!letters.contains(blocks[i -1]))
            		blocks[i] = String.valueOf((Integer.valueOf(blocks[i - 1]) + Integer.valueOf(blocks[i - 2])));                
            } else if("Z".equals(blocks[i]) && i > 0) {
            	blocks[i] = blocks[i -1];
                blocks[i - 1] = "0";
            }
        }
        
        return sum;
    }

}
