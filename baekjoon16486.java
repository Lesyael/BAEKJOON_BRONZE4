package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon16486 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float width = Float.parseFloat(br.readLine());
		float length = Float.parseFloat(br.readLine());  // 원의 반지름을 겸함
		
		System.out.println((width * 2) + (2 * 3.141592 * length));

	}

}