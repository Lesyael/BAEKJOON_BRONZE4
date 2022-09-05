package bronze4;

import java.util.Scanner;

public class baekjoon5554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int second = 0;
		int min;
		
		for (int i = 0, move[] = new int[4]; i < move.length; i++) {
			move[i] = sc.nextInt();
			second += move[i];
		}
		
		sc.close();
		
		min = second / 60;
		second %= 60;
		
		System.out.println(min + "\n" + second);
		
	}

}
