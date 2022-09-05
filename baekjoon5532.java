package bronze4;

import java.util.Scanner;

public class baekjoon5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int korean = sc.nextInt();
		int math = sc.nextInt();
		int kPage = sc.nextInt();
		int mPage = sc.nextInt();
		
		sc.close();
		
		if (korean % kPage != 0) {
			kPage = (korean / kPage) + 1;
		} else {
			kPage = korean / kPage;
		}
		if (math % mPage != 0) {
			mPage = (math / mPage) + 1;
		} else {
			mPage = math / mPage;
		}
				
		if (kPage > mPage) {
			day -= kPage;
		} else {
			day -= mPage;
		}
		
		System.out.println(day);
		
	}

}
