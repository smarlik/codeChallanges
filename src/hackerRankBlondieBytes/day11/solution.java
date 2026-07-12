package day11;

import java.util.Arrays;
import java.util.Scanner;

public class solution {

    static int sum(int arr[][], int r, int c) {
        int sum;
        sum = arr[r - 1][c + 1]
                + arr[r - 1][c]
                + arr[r - 1][c - 1]
                + arr[r][c]
                + arr[r + 1][c + 1]
                + arr[r + 1][c]
                + arr[r + 1][c - 1];
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int c = 0; c < 6; c++) {
            for (int r = 0; r < 6; r++) {
                arr[c][r] = in.nextInt();
            }
        }
        int sums[] = new int[16];
        int counter=0; 
        for (int r = 1; r < 5; r++) {
            for (int c = 1; c < 5; c++) {
                //System.out.println(sum(arr,r, c));
                sums[counter]=sum(arr,r, c);
                counter++;
            }
        }
        Arrays.sort(sums);
        //System.out.println(Arrays.toString(sums));
        System.out.println(sums[15]);
    }
}
