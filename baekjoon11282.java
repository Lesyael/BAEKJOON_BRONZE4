package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11282 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		n += 44031;  // �Է°��� �ƽ�Ű�ڵ� ���� ���߱� ���� 44031�� ����
		
		char c = (char) n;
		
		System.out.println(c);

	}

}
