package interviewquestions.methodoverriding;

public class Q13 {
    void m1() {

    }
}

class Two extends Q13 {
    @Override
    protected void m1() {
        System.out.println("m1-Two");
    }
}

class Three extends Two {
    @Override
    public void m1() {
        System.out.println("m1-Three");
    }
}