package bronze4;

import java.util.Scanner;

public class baekjoon14581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hongJoon = sc.nextLine();
		
		sc.close();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) {
					System.out.print(":" + hongJoon + ":");
				} else {
					System.out.print(":fan:");
				}
				
			}
			System.out.println();
			
		}

	}
	
}
