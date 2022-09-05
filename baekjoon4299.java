package bronze4;

import java.util.Scanner;

public class baekjoon4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int sub = sc.nextInt();
		
		sc.close();
		
		if ((sum + sub) % 2 != 0 || sum < sub) {
			System.out.println(-1);
		} else {
			int team1 = (sum + sub) / 2;
			int team2 = sum - team1;
		
			System.out.println(team1 + " " + team2);
		}
		
	}

}
