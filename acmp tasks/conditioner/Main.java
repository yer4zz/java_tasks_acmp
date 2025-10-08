package conditioner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int troom = sc.nextInt();
        int tcond = sc.nextInt();
        String mode = sc.next();

        if (mode.equals("freeze")) {
            System.out.println(Math.min(troom, tcond));
        } else if (mode.equals("heat")) {
            System.out.println(Math.max(troom, tcond));
        } else if (mode.equals("auto")) {
            System.out.println(tcond);
        } else if (mode.equals("fan")) {
            System.out.println(troom);
        }
    }
}