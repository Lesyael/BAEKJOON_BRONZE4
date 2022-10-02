package bronze4;

import java.util.Scanner;

public class baekjoon15726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        
        sc.close();
        
        int x = (int)((a * b) / c);
        int y = (int)((a / b) * c);
        
        if (x > y) {
        	System.out.println(x);
        } else {
        	System.out.println(y);
        }

	}

}
