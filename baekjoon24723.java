package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon24723 {

	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int greenTower = Integer.parseInt(br.readLine());
		
		int sum = 1;
		
		for (int i = 0; i < greenTower; i++) {
			sum *= 2;
			
		}
		
		System.out.println(sum);

	}

}
