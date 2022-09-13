package bronze4;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class baekjoon11948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int score[] = new int[6];
        int sum = 0;
        
        for(int i=0; i<6; i++) {
            score[i] = sc.nextInt();
            
        }
        
        sc.close();
        
        Arrays.sort(score, 0, 4);
        Arrays.sort(score, 4, 6);
        
        for(int i=1; i<4; i++){
        	sum += score[i];
        
        }
        
        sum += Math.max(score[4], score[5]);
        
        System.out.println(sum);

	}

}
