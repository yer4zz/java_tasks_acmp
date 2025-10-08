package flowers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ka = k % 3;

        if (ka == 0) {
            System.out.println("GCV");
        } else if (ka == 1) {
            System.out.println("VGC");
        } else {
            System.out.println("CVG");
        }
    }
}
