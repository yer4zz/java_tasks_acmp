package geaometriaBlyatStrong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int c1 = x2 - x1;
        int c2 = y2 - y1;
        int c = c1 * c1 + c2 * c2;

        double s = Math.sqrt(c);

        System.out.println(s);
    }
}//e
