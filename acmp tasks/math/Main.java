package math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.contains("0")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}