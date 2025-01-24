package practiceprograms;

public class PrintOddEven {
    public static void main(String[] args) {
        int arr [] = {10, 11, 20, 21, 30, 31, 40, 41, 50, 51};

        System.out.print("Even Elements : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Odd Elements : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
