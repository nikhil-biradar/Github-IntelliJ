package string.stringmethods;

public class SplitMethod {
    public static void main(String[] args) {
        String string = "I Love Java Technology";

        String arr [] = string.split(" ");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}