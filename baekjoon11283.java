package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11283 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch = br.readLine().charAt(0);
		
		int n = ch;
		
		n -= 44031;  // �Է°��� �ƽ�Ű�ڵ� ���� ��
		
		System.out.println(n);

	}

}
