package bronze4;

import java.util.Scanner;

public class baekjoon2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int second = sc.nextInt();
		int runTime = sc.nextInt();
		
		sc.close();
		
		min += runTime / 60;
		second += runTime % 60;
		
		min += second / 60;
		second %= 60;
		
		hour += min / 60;
		min %= 60;
		
		hour %= 24;
		
		System.out.println(hour + " " + min + " " + second);

	}

}
