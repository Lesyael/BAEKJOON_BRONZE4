package bronze4;

import java.util.Scanner;

public class baekjoon10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		
		int count[] = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			char strCh = str.charAt(i);
			char alphabet = 'a';
			
			for (int j = 0; j < count.length; j++) {
				if (strCh == alphabet) {
					count[j]++;
				}
				
				alphabet++;
				
			}
			
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}

	}

}
