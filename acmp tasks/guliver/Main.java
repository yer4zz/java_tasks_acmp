package guliver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int m = in.nextInt();

        int result = k * k * (k / m);

        System.out.println(result);
    }
}