package interviewquestions.methodoverriding;

public class Q10 {
    public Object m1() {
        return null;
    }
    void m2(Number n) {
        System.out.println("m1-P");
    }
}

class P extends Q10 {
    public StringBuffer m1() {
        return null;
    }
    void m2(double d) {
        System.out.println("m2-Q");
    }

    public static void main(String[] args) {

    }
}