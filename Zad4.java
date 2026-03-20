import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Błąd");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
    }
}