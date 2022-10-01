package bronze4;

import java.util.Scanner;

public class baekjoon25377 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int minTime = -1;
		
		for (int i = 0, moveTime, koiTime; i < count; i++) {
			moveTime = sc.nextInt();
			koiTime = sc.nextInt();
			
			if (moveTime <= koiTime) {
				if (minTime == -1 || minTime > koiTime) {
					minTime = koiTime;
				}
				
			}
			
		}
		
		sc.close();
		
		System.out.println(minTime);
		
	}

}
