package bronze4;

import java.util.Scanner;

public class baekjoon2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		sc.close();
		
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
