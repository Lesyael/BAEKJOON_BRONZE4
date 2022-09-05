package bronze4;

import java.util.Scanner;

public class baekjoon2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		sc.close();
		
		if (x > y) {
			x = x ^ y;
			y = x ^ y;
			x = x ^ y;
		}
		if (x > z) {
			x = x ^ z;
			z = x ^ z;
			x = x ^ z;
		}
		if (y > z) {
			y = y ^ z;
			z = y ^ z;
			y = y ^ z;
		}
		
		System.out.println(x + " " + y + " " + z);
		
	}

}
