package practiceprograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while(temp != 0){
            rev = (temp % 10 + (rev * 10));
            temp /= 10;
        }

        System.out.println("reverse Number : " + rev);

        if(rev == num){
            System.out.println("Number is Palindrome...");
        }else{
            System.out.println("Number is not Palindrome...");
        }
    }
}
