package exceptionhandling;

//Exception Occurs if divide by 0
public class ArithmeticException {
    public static void main(String[] args) {

        System.out.println("One");
        System.out.println("Two");

        //Exception Handling
        try{
            System.out.println(10/0);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("A Number cannot be divided by zero");
        }

        System.out.println("Three");
        System.out.println("Four");
    }
}
