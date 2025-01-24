package accessmodifiers.constructor;

public class This {

    int a = 10;
    static int b = 20;
    String c = "Nikihl";

    void Display()
    {
        this.a = 100;
        System.out.println(a);
        this.b = 600;
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        This obj = new This();
        obj.Display();

//        new This().Display(); // We can also call method like this
    }
}