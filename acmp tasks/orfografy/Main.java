package orfografy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i != k - 1) {
                System.out.print(arr[i]);
            }
        }
    }
}