package interfaces;

interface A{
     default void show(){ // Since Java 8 we can add default methods in interface
         System.out.println("Interface interfaces.A");
    }
}

interface B{
    default void show(){
        System.out.println("Interface interfaces.B");
    }
}

class C implements A, B{

    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }

    public void newShow(){
        System.out.println("Modified show method");
    }

    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.newShow();
    }
}


