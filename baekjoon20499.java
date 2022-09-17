package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon20499 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] arr = str.split("/");
		
		int k = Integer.parseInt(arr[0]);
		int d = Integer.parseInt(arr[1]);
		int a = Integer.parseInt(arr[2]);
		
		if ((k + a) < d || d == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}

}
