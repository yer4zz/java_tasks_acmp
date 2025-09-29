package oreshki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        
        int total = n * m;
        
        if (total >= k) {
            System.out.println("ye");
        } else {
            System.out.println("no");
        }
    }
}