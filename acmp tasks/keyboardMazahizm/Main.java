package keyboardMazahizm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char r = ' ';

        if (c == 'q') r = 'w';
        else if (c == 'w') r = 'e';
        else if (c == 'e') r = 'r';
        else if (c == 'r') r = 't';
        else if (c == 't') r = 'y';
        else if (c == 'y') r = 'u';
        else if (c == 'u') r = 'i';
        else if (c == 'i') r = 'o';
        else if (c == 'o') r = 'p';
        else if (c == 'p') r = 'a';
        else if (c == 'a') r = 's';
        else if (c == 's') r = 'd';
        else if (c == 'd') r = 'f';
        else if (c == 'f') r = 'g';
        else if (c == 'g') r = 'h';
        else if (c == 'h') r = 'j';
        else if (c == 'j') r = 'k';
        else if (c == 'k') r = 'l';
        else if (c == 'l') r = 'z';
        else if (c == 'z') r = 'x';
        else if (c == 'x') r = 'c';
        else if (c == 'c') r = 'v';
        else if (c == 'v') r = 'b';
        else if (c == 'b') r = 'n';
        else if (c == 'n') r = 'm';
        else if (c == 'm') r = 'q';

        System.out.println(r);
    }
}