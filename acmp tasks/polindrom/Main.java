package polindrom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = n / 1000;
        int n2 = (n / 100) % 10;
        int n3 = (n / 10) % 10;
        int n4 = n % 10;

        if (n1 == n4 && n2 == n3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}