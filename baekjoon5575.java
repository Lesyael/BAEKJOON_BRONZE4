package bronze4;

import java.util.Scanner;

public class baekjoon5575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int go[] = new int[3];
		int leave[] = new int[3];
		int work[] = new int[3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				go[j] = sc.nextInt();
			}
			for (int j = 0; j < 3; j++) {
				leave[j] = sc.nextInt();
			}
			
			for (int j = 0; j < 3; j++) {
				work[j] = leave[j] - go[j];
			}
			
			for (int j = 1; j >= 0; j--) {
				if (work[j + 1] < 0) {
					work[j]--;
					work[j + 1] += 60;
				}
			}
			
			for (int j = 0; j < 3; j++) {
				System.out.print(work[j] + " ");
			}
			
		}
		
		sc.close();
		
	}

}
