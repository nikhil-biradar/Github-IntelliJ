package oops.encapsulation;

public class Example2 {

    private int id = 123;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.name = "Nikhil";
        obj.getId();

        System.out.println(obj.getName()  + " " + obj.getId());
    }
}