import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M1 = sc.nextInt();
        int M2 = sc.nextInt();
        int M3 = sc.nextInt();

        int max = Math.max(M1, Math.max(M2, M3));
        int sumOthers = M1 + M2 + M3 - max;

        if (max == sumOthers) {
            System.out.println(max);
        } else {
            System.out.println("Error");
        }
    }
}
