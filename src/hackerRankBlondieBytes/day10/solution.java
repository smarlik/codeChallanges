package day10;

import java.util.*;
import java.io.*;

public class solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
         for (int x = 0; x < t; x++) {
            int n = in.nextInt();
            String binary = Integer.toBinaryString(n);
            System.out.println(binary);
        }
    }
}