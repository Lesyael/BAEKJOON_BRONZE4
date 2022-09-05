package bronze4;

import java.util.Scanner;

public class baekjoon2083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age, weight;
		
		while (true) {
			name = sc.next();
			age = sc.nextInt();
			weight = sc.nextInt();
			
			if (name.charAt(0) == '#') {
				break;
			}
			
			System.out.print(name + " ");
			
			if (age > 17 || weight >= 80) {
				System.out.println("Senior");
			} else {
				System.out.println("Junior");
			}
		}
		
		sc.close();

	}

}
