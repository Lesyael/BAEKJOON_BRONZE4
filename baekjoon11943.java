package bronze4;

import java.util.Scanner;

public class baekjoon11943 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bowl[] = new int[4];
		
		for (int i = 0; i < bowl.length; i++) {
			bowl[i] = sc.nextInt();
		}
		
		sc.close();
		
		int move1 = bowl[0] + bowl[3];
		int move2 = bowl[1] + bowl[2];
		
		if (move1 < move2) {
			System.out.println(move1);
		} else {
			System.out.println(move2);
		}
		
	}

}
