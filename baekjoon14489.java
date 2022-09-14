package bronze4;

import java.util.Scanner;

public class baekjoon14489 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance1 = sc.nextInt();
		int balance2 = sc.nextInt();
		int chicken = (sc.nextInt() * 2);
		
		sc.close();
		
		int balSum = balance1 + balance2;
		
		if (balSum >= chicken) {
			System.out.println(balSum - chicken);
		} else {
			System.out.println(balSum);
		}
		
		
	}

}
