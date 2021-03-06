/*
Составить линейную программу,
печатающую значение True, если указанное высказывание является истинным, и False — в противном случае:
g.	Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
 */

import java.util.Scanner;

public class Task37_7 {
    public static void main(String[] args) {
        int n;
        int a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        n = in.nextInt();

        a = n % 10;
        b = (n / 10) % 10;
        c = (n / 100) % 10;

        if ((a + b) == c || (b + c) == a || (c + a) == b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
