package bronze4;

import java.util.Scanner;

public class baekjoon23825 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		if (n < m) {
			System.out.println(n / 2);
		} else {
			System.out.println(m / 2);
		}

	}

}
