//Bubble sort

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double kubek;

        // 5 1. 3

        if (a > b) {
            kubek = a;
            a = b;
            b = kubek;
        }
        // [1 5] 3.

        if (a > c) {
            kubek = a;
            a = c;
            c = kubek;
        }
        // [1] 5 [3]
        if (b > c) {
            kubek = b;
            b = c;
            c = kubek;
        }
        // 1 [3 5.]
        System.out.printf("%f %f %f", a,b,c);
        System.out.printf("%f %f %f", c,b,a); //hehe
    }
}
