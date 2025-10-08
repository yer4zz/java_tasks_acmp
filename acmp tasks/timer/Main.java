package timer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();

        int hours = (t + 12 - s) % 12;
        if (hours == 0) hours = 12;

        System.out.println(hours);
    }
}
