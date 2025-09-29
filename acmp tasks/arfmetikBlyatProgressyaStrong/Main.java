package arfmetikBlyatProgressyaStrong;

import java.util.Scanner;
//????
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int n = in.nextInt();

        int d = a2 - a1;
        int an = a1 + d * (n - 1);

        System.out.println(an);
    }
}