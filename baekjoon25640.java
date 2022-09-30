package bronze4;

import java.util.Scanner;

public class baekjoon25640 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mbti = sc.next();
		int friend = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < friend; i++) {
			if (mbti.equals(sc.next())) {
				count++;
			}
			
		}
		
		sc.close();
		
		System.out.println(count);

	}

}
