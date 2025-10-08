import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int countHeads = 0;
        int countTails = 0; 

        for (int i = 0; i < N; i++) {
            int coin = scanner.nextInt();
            if (coin == 1) {
                countHeads++;
            } else {
                countTails++;
            }
        }

        int result = Math.min(countHeads, countTails);

        System.out.println(result);
    }
}
