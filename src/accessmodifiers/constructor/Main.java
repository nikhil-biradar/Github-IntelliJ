package accessmodifiers.constructor;

public class Main {
    int x;
    long l;
    String s;
    boolean y;

//    Practice_Programs.MainClass(){
//        System.out.println("Hi Nikhil ! Constructor Called...");
//    }
//
//    public int Add(int a, int b){
//        return a + b;
//    }


    public static void main(String[] args) {
        Main obj = new Main();
//        int result = obj.Add(10, 20);
//        System.out.println(result);

        System.out.println(obj.x); // Default Value of x = 0
        System.out.println(obj.l); // Default Value of x = 0
        System.out.println(obj.s); // Default Value of x = null
        System.out.println(obj.y); // Default Value of x = false

    }
}
