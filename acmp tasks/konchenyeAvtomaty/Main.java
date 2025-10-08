package konchenyeAvtomaty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int k = in.nextInt();

        for (int i = 0; i < k; i++) {
            long n = in.nextLong();
            long m = in.nextLong();

            long d = 19 * m + (n + 239) * (n + 366) / 2;
            System.out.println(d);
        }
    }
}