package day5;

import java.util.Scanner;

/** 
 * https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops
 */

public class solution {
    static Scanner scanner = new Scanner(System.in);
public static void calc(int a, int b, int n) {
    double res=a;
    for(int c=0;c<n;c=c+1) {
        res=res+Math.pow(2, c)*b;
          System.out.print((int)res+" ");
    }
}

public static void main(String[] args) {
    int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            calc(a, b, n);
            System.out.print("\n");
    
} 

}
}