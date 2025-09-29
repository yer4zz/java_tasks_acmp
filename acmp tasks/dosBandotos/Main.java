package dosBandotos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int total = a + b - 1;

        int harryPotter = total - a;
        int larryLotter = total - b;

        System.out.println(harryPotter + " " + larryLotter);
    }
}