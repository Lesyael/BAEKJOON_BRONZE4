package bronze4;

import java.util.Scanner;

public class baekjoon16199 {
	
	static void ageCheak(int birth[], int cheak[]) {
		if (cheak[0] == birth[0]) {
			System.out.println(0);
		} else if (cheak[1] > birth[1] || (cheak[1] == birth[1] && cheak[2] >= birth[2])) {
			System.out.println(cheak[0] - birth[0]);
		} else if (cheak[1] < birth[1] || (cheak[1] == birth[1] && cheak[2] < birth[2])) {
			System.out.println(cheak[0] - birth[0] - 1);
		}
		
		System.out.println(cheak[0] - birth[0] + 1);
		
		System.out.println(cheak[0] - birth[0]);
	}
	
	public static void main(String[] args) {
		int birth[] = new int[3];
		int cheak[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			birth[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			cheak[i] = sc.nextInt();
		}
		
		sc.close();
		
		ageCheak(birth, cheak);
	}

}
