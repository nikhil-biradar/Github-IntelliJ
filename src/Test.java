

public class Test {

    public static void main(String[] args) {

        int arr [] = {1, 5, -8, 6, 7, 0, -3, 4};


    }

    /*
    public static void main(String[] args) {

        String s1 = " Nikhil";
        String s2 = " Nikhil";
        String s3 = " Nikhil";
        String s4 = " Nikhil";
        s1 = s1.concat("Biradar");


        System.out.println(s1 == s2 && s2 == s3 && s3 == s4);
    }*/
}




/*
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String s1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter String s2 : ");
        String s2 = sc.nextLine();

        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
*/

/*
class Test {

    int a;
    int b;

    Test(){
        System.out.println(a + " " + b);
    }

    Test(int a, int b){
        System.out.println(a + " " +b);
    }

    public static void main(String[] args) {
        Test a = new Test(20, 30);
        Test b = new Test();
    }
}
*/

//class A extends Test {
//
//    public static void main(String[] args) {
//        Test a = new Test();
//
//    }
//}


//BinarySearch Array Method
/*
import java.util.Arrays;
public class Test {
    public static void main(String[] args)
    {
        // Creating a sorted array of int and char types.
        int[ ] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index of element 11 is " + Arrays.binarySearch(list, 11));
        System.out.println("2. Index of element 12 is " + Arrays.binarySearch(list, 5));

        char[ ] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index of element 'a' is " + Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index of element 't' is " + Arrays.binarySearch(chars, 't'));

        // Creating unsorted array.
        int[ ] num = {25, 35, 10, 45, 20, 30};
        Arrays.sort(num); // Sorting array.
        System.out.println("5. Index of element 45 is " +Arrays.binarySearch(num, 45));
    }
}
*/

//toString Array Method
/*
public class Test {
    public static void main(String[] args) {
        // Array of strings
        String[] fruits = {"Cherry", "Apple", "Banana", "App"};

        // Using Arrays.toString() to convert the array to a string
        String result = Arrays.toString(fruits);

        // Printing the result
        System.out.println(result); // Output: [Apple, Banana, Cherry]
    }
}
*/


/*
//Constructor Chaining

class Test1 {
    public Test1() {
        this(12);
        System.out.println("No-arg Constructor Test1");
    }

    public Test1(int m) {
        this("JJ", 45);
        System.out.println("1-arg Constructor Test1");
    }

    public Test1(String m, int n) {
        System.out.println("2-arg Constructor Test1");
    }
}
public class Test extends Test1 {
    public Test() {
        this(23, "Aa");
        System.out.println("No-arg Constructor Test");
    }

    public Test(int a, String b) {
        this("aa", 12, true);
        System.out.println("2-arg Constructor Test");
    }

    public Test(String a , int b, boolean c) {
        System.out.println("3-arg Constructor Test");
    }

    public static void main(String[] args) {
        Test t = new Test();

    }
}
*/