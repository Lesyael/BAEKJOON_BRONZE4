package bronze4;

import java.util.Scanner;

public class baekjoon16204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int card = sc.nextInt();
		int frontO = sc.nextInt();
		int behindO = sc.nextInt();
		
		sc.close();
		
		System.out.print(Math.min(frontO, behindO) + Math.min(card - frontO, card - behindO));
		
	}

}
