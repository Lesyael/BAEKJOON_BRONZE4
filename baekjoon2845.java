package bronze4;

import java.util.Scanner;

public class baekjoon2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();
		int area = sc.nextInt();
		int correct = people * area;
		
		int report[] = new int[5];
		
		for (int i = 0; i < report.length; i++) {
			report[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < report.length; i++) {
			System.out.print(report[i] - correct + " ");
		}
		
	}

}
