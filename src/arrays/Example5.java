package arrays;

public class Example5 {
    String name;
    int rollNo;

    public Example5(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Example5 e [] = new Example5[]{
                new Example5("Nikihi", 23),
                new Example5("Nitin", 25),
                new Example5("Sonali", 27)
        };

        for(int i = 0; i < e.length; i++){
            System.out.println("Name : " + e[i].name + " rollNo : " + e[i].rollNo);
        }
    }
}
