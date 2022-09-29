package bronze4;

import java.util.Scanner;

public class baekjoon25191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int cnb = a / 2 + b;
		
		System.out.println(Math.min(n, cnb));
	}

}
