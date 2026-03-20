import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Błąd");
            return;
        }

        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        int sum = 0;
    }
}
