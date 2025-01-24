package oops.encapsulation;

class Student1
{
    Integer id; // Here, no encapsulation is used. Since the field is not private.
}
public class Test
{
    public static void main(String[][] args)
    {
        Student1 st = new Student1();
        st.id = 2; // As the field is not private. So, anyone can access it from outside the class.
    }
}