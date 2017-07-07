package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] nums = {a, b, c, d, e};
        Arrays.sort(nums);
        
        long min = nums[0] + nums[1] + nums [2] + nums[3];
        long max = nums[1] + nums[2] + nums [3] + nums[4];
        
        System.out.println(min + " " + max);
    }
}
