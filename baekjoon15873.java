package bronze4;

import java.util.Scanner;

public class baekjoon15873 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums = sc.nextInt();
		
		sc.close();
		
		int sum = (nums / 10) + (nums % 10);
		
		if (nums / 10 > 10) {
			sum = (nums / 100) + (nums % 100);
		} else if (nums == 1010) {
			sum = 20;
		}
		
		System.out.println(sum);

	}

}
