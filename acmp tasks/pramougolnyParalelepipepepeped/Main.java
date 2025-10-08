package pramougolnyParalelepipepepeped;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s = 2 * (a*b + a*c + b*c);
        int v = a * b * c;

        System.out.println(s + " " + v);
    }
}