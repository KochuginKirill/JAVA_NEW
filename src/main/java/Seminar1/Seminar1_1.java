package Seminar1;
import java.util.Scanner;

public class Seminar1_1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = Scanner.nextLine();
        System.out.printf("Привет, %s!", name);
        Scanner.close();
    }
}
