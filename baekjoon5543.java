package bronze4;

import java.util.Scanner;

public class baekjoon5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int burger[] = new int[3];
		int drink[] = new int[2];
		
		for (int i = 0; i < burger.length; i++) {
			burger[i] = sc.nextInt();
		}
		
		for (int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < burger.length - 1; i++) {
			if (burger[0] > burger[i + 1]) {
				burger[0] = burger[i + 1];
			}
		}
		
		for (int i = 0; i < drink.length - 1; i++) {
			if (drink[0] > drink[i + 1]) {
				drink[0] = drink[i + 1];
			}
		}
		
		System.out.println(burger[0] + drink[0] - 50);
		
	}

}
