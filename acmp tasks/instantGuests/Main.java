package instantGuests;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r1 = sc.nextLong();
        long r2 = sc.nextLong();
        long r3 = sc.nextLong();

        if (r1 >= r2 + r3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}