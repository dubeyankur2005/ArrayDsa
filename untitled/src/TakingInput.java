import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Taking input in array :");
        System.out.print("Enter the size of the array : ");
        int num = input.nextInt();
        int [] arr = new int[num];

        int i =0;
        while(i<arr.length){
            System.out.print("Enter the " + (i+1) + " elements of the array : ");
            arr [i] = input.nextInt();
            i++;

        }

    }
}
