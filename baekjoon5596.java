package bronze4;

import java.util.Scanner;

public class baekjoon5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testScore[] = new int[2];
		
		for (int i = 0; i < testScore.length; i++) {
			for (int j = 0, score; j < 4; j++) {
				score = sc.nextInt();
				testScore[i] += score;
			}
			
		}
		
		sc.close();
		
		if (testScore[0] < testScore[1]) {
			testScore[0] = testScore[1];
		}
		
		System.out.println(testScore[0]);
		
	}

}
