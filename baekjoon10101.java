package bronze4;

import java.util.Scanner;

public class baekjoon10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int triAngle[] = new int[4];
		
		for (int i = 0; i < 3; i++) {
			triAngle[i] = sc.nextInt();
			triAngle[3] += triAngle[i];
		}
		
		sc.close();
		
		if (triAngle[3] != 180) {
			System.out.println("Error");
		} else if (triAngle[0] == 60 && triAngle[0] == triAngle[1]) {
			System.out.println("Equilateral");
		} else if (triAngle[0] == triAngle[1] || triAngle[0] == triAngle[2] || triAngle[1] == triAngle[2]) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}

	}

}
