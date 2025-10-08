package vodka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long C = sc.nextLong();
        long H = sc.nextLong();
        long O = sc.nextLong();

        long maxMolecules = Math.min(C / 2, Math.min(H / 6, O));
        System.out.println(maxMolecules);
    }
}