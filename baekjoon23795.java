package bronze4;

import java.util.Scanner;

public class baekjoon23795 {

	public static void main(String[] args) {
		int money, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			money = sc.nextInt();
			
			if (money == -1) {
				break;
			}
			
			sum += money;
			
		}
		
		sc.close();
		
		System.out.println(sum);

	}

}
