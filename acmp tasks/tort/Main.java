import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int masha = in.nextInt();
        int misha = in.nextInt();
        int eat = in.nextInt();
        
        if (masha + misha >= eat){
            System.out.println(misha + masha);
        } else {
            System.out.println("Impossible");
        }
    }
}