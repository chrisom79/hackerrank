package hackerrank;

import java.util.Scanner;

public class GradingStudents {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            int div = (int) Math.ceil(grade / 5.0);
            if(grade >= 38 && ((div * 5) - grade) < 3)
            	System.out.println(div * 5);
            else
            	System.out.println(grade);
        }
    }
}
