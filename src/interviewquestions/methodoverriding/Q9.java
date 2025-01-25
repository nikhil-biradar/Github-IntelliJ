package interviewquestions.methodoverriding;

public class Q9 {
    void m1(Number n) {
        System.out.println("m1-P");
    }
}

class Q2 extends Q9 {
    void m1(double d) {
        System.out.println("m2-Q");
    }

    public static void main(String[] args) {
        Q2 q = new Q2();
        q.m1(1);
        q.m1(null);
    }
}