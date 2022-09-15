package bronze4;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon14623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger(2);
        BigInteger b = sc.nextBigInteger(2);
        
        sc.close();
        
        BigInteger multiply = a.multiply(b);
        String result = multiply.toString(2);
        
        System.out.println(result);


    }
}
