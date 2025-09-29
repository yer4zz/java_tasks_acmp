package luckyDepStrong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = a / 1000;
        int c = a % 1000;

        int left = b / 100 + (b / 10) % 10 + b % 10;
        int right = c / 100 + (c / 10) % 10 + c % 10;

        if (left == right) {
            System.out.println("ye");
        } else {
            System.out.println("no");//bal
        }
    }
}