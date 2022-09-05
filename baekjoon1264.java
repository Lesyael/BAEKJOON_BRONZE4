package bronze4;

import java.util.Scanner;

public class baekjoon1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String engString;
		
		while (true) {
			int count = 0;
			engString = sc.nextLine().toLowerCase();
			
			if (engString.charAt(0) == '#') {
				break;
			}
			
			for (int i = 0; i < engString.length(); i++) {
				switch (engString.charAt(i)) {
					case 'a': count++; break;
					case 'e': count++; break;
					case 'i': count++; break;
					case 'o': count++; break;
					case 'u': count++; break;
				}
				
			}
			
			System.out.println(count);
			
		}
		
		sc.close();
		
	}

}
