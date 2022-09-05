package bronze4;

import java.util.Scanner;

public class baekjoon4470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		sc.nextLine();
		
		String str;
		
		for(int i = 1; i <= line; i++) {
			str = sc.nextLine();
			
			System.out.println(i + ". " + str);
		}
		
		sc.close();

	}

}
