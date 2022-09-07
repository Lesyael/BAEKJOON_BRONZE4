package bronze4;

import java.util.Scanner;

public class baekjoon11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int count = sc.nextInt();
		String str = sc.next();
		
		sc.close();
		
		for (int i = 0; i < count; i++) {
			sum += (str.charAt(i) - '0');
		}
		
		System.out.println(sum);
		
	}

}
