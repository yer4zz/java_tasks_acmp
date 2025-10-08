import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        int h = sc.nextInt();
        int r = sc.nextInt();
        int d = 2 * r;

        int minS = Math.min(w, h);

        if (d <= minS) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}