package bronze4;

import java.util.Scanner;

public class baekjoon10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int count = sc.nextInt();
		int money = sc.nextInt();
		
		sc.close();
		
		int needful = price * count;
		
		if (money >= needful) {
			System.out.println(0);
		} else {
			System.out.println(needful - money);
		}
		
	}

}
