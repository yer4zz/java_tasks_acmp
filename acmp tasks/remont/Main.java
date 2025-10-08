package remont;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        int S = 2 * H * (L + W);
        int cans = (S + 15) / 16;

        System.out.println(cans);
    }
}