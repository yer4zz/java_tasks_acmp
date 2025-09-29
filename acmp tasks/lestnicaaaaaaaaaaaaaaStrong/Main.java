package lestnicaaaaaaaaaaaaaaStrong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//sa
        int k = in.nextInt();
        int height = 0;

        while (height * (height + 1) / 2 <= k) {
            height++;
        }

        System.out.println(height - 1);
    }
}
