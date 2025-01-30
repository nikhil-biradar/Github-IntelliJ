package string;

public class Hashcode {
    public static void main(String[] args) {

        // Using String Literal
        String s1 = "Nikhil";
//        String s2 = "Nikhil";
//
//        s2.concat("Biradar");
//        System.out.println(s2);




        //Using New Keyword
        String s3 = new String ("Nikhil");
        String s5 = new String ("Nikhil");
        String s4 = "Nikhil";


        System.out.println(s1 == s4);
        System.out.println(s3 == s5);


        /*
        //Using Character Array
        char arr [] = {'N', 'i', 'k', 'h', 'i', 'l'};
        String s5 = new String(arr);
        System.out.println(s5.hashCode());
        */

//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());

//        String s = "hello";
//
//        // Calling concat() method to add string at the end.
//        s.concat("world");
//
//        System.out.println(s.concat("World"));
    }
}