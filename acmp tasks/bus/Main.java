package bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int bus = 437;

        for (int i = 1; i <= num; i++) {
            int m = sc.nextInt();
            if (m <= bus) {
                System.out.println("Crash " + i);
            }
        }
        
        System.out.println("No crash");
    }
}