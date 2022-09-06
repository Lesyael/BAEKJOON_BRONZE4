package bronze4;

import java.util.Scanner;

public class baekjoon10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		sc.close();
		
		if (month == 2 && day == 18) {
			System.out.println("Special");
			
		} else if (month < 2 || month == 2 && day < 18) {
			System.out.println("Before");
		} else if (month > 2 || month == 2 && day > 18) {
			System.out.println("After");
		}

	}

}
