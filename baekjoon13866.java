package bronze4;

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon13866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[4];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		Arrays.sort(num);
		
		int sum1 = num[0] + num[3];
		int sum2 = num[1] + num[2];
		
		if (sum1 > sum2) {
			System.out.println(sum1 - sum2);
		} else {
			System.out.println(sum2 - sum1);
		}

	}

}
