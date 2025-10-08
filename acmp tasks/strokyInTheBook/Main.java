package strokyInTheBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int page = (n + k - 1) / k;
        int stroka = n % k;
        if (stroka == 0) stroka = k;

        System.out.println(page + " " + stroka);
    }
}