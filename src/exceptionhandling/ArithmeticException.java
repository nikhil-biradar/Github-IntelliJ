package exceptionhandling;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        int div = num1 / num2;
        System.out.println("Sum is : " + div);
    }
}