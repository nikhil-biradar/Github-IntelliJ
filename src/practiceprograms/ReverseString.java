package practiceprograms;

import java.util.Locale;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
             rev += str.charAt(i);
        }

        rev = rev.toUpperCase();
        System.out.println("Reversed String : " + rev);
    }
}
