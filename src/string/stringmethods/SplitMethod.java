package string.stringmethods;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "I Love Java Technology";

        String arr [] = str.split(" ");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}