package interviewquestions.methodoverriding;

public class Q8 {
    static void m1() {
        System.out.println("Class P");
    }
}

class Q extends Q8 {
//    @Override
    static void m1() {
        System.out.println("Class Q");
    }
}