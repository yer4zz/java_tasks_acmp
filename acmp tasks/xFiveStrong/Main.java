package xFiveStrong;

import java.util.Scanner;
//za
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int result = xFive(num);
        System.out.println(result);
    }

    public static int xFive(int n) {
        if (n % 10 == 5) {
            return n * n;
        } else {
            return n;
        }
    }
}
