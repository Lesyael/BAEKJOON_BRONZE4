package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11282 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		n += 44031;  // 입력값과 아스키코드 값을 맞추기 위해 44031을 더함
		
		char c = (char) n;
		
		System.out.println(c);

	}

}
