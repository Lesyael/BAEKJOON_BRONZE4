package bronze4;

import java.util.Scanner;

public class baekjoon11365 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			
			if (str.equals("END")) {
				break;
			}
			
			StringBuffer sb = new StringBuffer(str);
			String reverse = sb.reverse().toString();
			
			System.out.println(reverse);
			
		}
		
		sc.close();

	}

}
