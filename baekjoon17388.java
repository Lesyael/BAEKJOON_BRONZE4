package bronze4;

import java.util.Scanner;
import java.lang.Math;

public class baekjoon17388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		sc.close();
		
		int min = Math.min(s, k);
		min = Math.min(min, h);
		
		if(s + k + h >= 100) {
			System.out.println("OK");
		} else if (s == min) {
			System.out.println("Soongsil");
		} else if (k == min) {
			System.out.println("Korea");
		} else if (h == min) {
			System.out.println("Hanyang");
		}

	}

}
