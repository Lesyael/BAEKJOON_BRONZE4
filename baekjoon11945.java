package bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11945 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String str1[] = br.readLine().split(" "); 
		int n = Integer.parseInt(str1[0]); 
		int m = Integer.parseInt(str1[1]); 
		
		for (int i = 0; i < n; i++)  { 
			String str = br.readLine(); 
			
			for (int j = 0; j < m; j++) { 
				bw.write(str.charAt(m - j - 1)); 
			} 
			
			bw.write("\n"); 
			
		} 
		
		bw.flush(); 
		
	} 
	
}
