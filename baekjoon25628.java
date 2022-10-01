package bronze4;

import java.util.Scanner;

public class baekjoon25628 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bread = sc.nextInt() / 2;
		int meet = sc.nextInt();
		
		sc.close();
		
		if (bread <= meet) {
			System.out.println(bread);
		} else {
			System.out.println(meet);
		}
		
	}

}
