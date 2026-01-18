
import java .util.Scanner;
public class maximumNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Maximum number of the array finder : ");
        System.out.print("Please enter the size of the array : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        takingInput(arr);
        int max=maximumNumber(arr);
        System.out.println("The maximum number of the array is " + max);

    }
    public static void takingInput(int [] arr){
        Scanner input = new Scanner (System.in);
        int i=0;
        while(i<arr.length) {
            System.out.print("please enter the " + (i + 1) + " elements of the array : ");
            arr[i]=input.nextInt();
            i++;

        }

    }
    public static int maximumNumber(int[] arr){
        int max = arr[0];
        int i=0;
        while(i<arr.length){
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

}
