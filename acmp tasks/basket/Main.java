package basket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dom1 = 0;
        int dom2 = 0;

        for (int i = 0; i < 4; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            dom1 += a;
            dom2 += b;
        }

        if (dom1 > dom2) {
            System.out.println(1);
        } else if (dom2 > dom1) {
            System.out.println(2);
        } else {
            System.out.println("draw");
        }
    }
}
