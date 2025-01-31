package string.stringmethods;

public class Intern {
    public static void main(String[] args) {

        String s1 = "Nikhil";
        String s2 = new String("Nikhil");
        String s3 = s2.intern();

        System.out.println(s1 == s3);
    }
}