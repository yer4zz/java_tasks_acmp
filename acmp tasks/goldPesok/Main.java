package goldPesok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        if (a1 < a2) { int t = a1; a1 = a2; a2 = t; }
        if (a2 < a3) { int t = a2; a2 = a3; a3 = t; }
        if (a1 < a2) { int t = a1; a1 = a2; a2 = t; }

        if (b1 < b2) { int t = b1; b1 = b2; b2 = t; }
        if (b2 < b3) { int t = b2; b2 = b3; b3 = t; }
        if (b1 < b2) { int t = b1; b1 = b2; b2 = t; }

        System.out.println(a1*b1 + a2*b2 + a3*b3);
    }
}