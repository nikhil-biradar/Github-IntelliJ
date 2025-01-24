package block;

import org.w3c.dom.ls.LSOutput;

public class AllMixBlocks {

    static {
        System.out.println("Static Block");
    }

    {

        System.out.println("Instance Block");

    }

    public void display(){

        System.out.println("Local Block");
    }

    public static void main(String[] args) {
        AllMixBlocks obj = new AllMixBlocks();
        obj.display();
    }
}
