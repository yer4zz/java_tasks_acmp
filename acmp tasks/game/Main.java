package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        System.out.println(k + "9" + (9 - k));
    }
}
