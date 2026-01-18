import java.util.Scanner;
public class MaxAndMinNumber {
    public static void main(String [] args ){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to finding the max and min number of the array :- ");
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // taking input of the array
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter the element no "+(i+1)+":- ");
            arr[i]=input.nextInt();
        }

        MaximumAndMinimumNumber(arr);
    }
    public static void MaximumAndMinimumNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++){
            if(max<arr[i]) max = arr[i];
            if(min>arr[i]) min = arr[i];

        }
        System.out.print("The maximum number of the array is :- "+max+ "/n");
        System.out.print("The Minimum number of the array is :- "+min);
    }
}
