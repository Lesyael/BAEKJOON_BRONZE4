package bronze4;

import java.util.Scanner;

public class baekjoon10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allScore = 0;
		
		for (int i = 0, score; i < 5; i++) {
			score = sc.nextInt();
			
			if (score < 40) {
				score = 40;
			}
			
			allScore += score;
		}
		
		sc.close();
		
		System.out.println(allScore / 5);

	}

}
