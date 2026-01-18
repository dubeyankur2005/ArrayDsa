// W.A.P to check if an array is sorted .

import java.util.Scanner;
public class ArrayIsSorted {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // Taking Input in array
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print("Enter the element of the array "+(i+1) +" :- ");
            arr[i]=input.nextInt();

        }
        boolean increase = isIncreasingOrder(arr);
        boolean decrease = isDecreasingOrder(arr);
        if(increase) System.out.print("The array is sorted in Increasing order ");
        else if(decrease) System.out.print("The array is sorted in decreasing order ");
        else System.out.print("The array is not sorted ");
    }
    public static boolean isIncreasingOrder(int [] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false ;
            }
        }
        return true;
    }
    public static boolean isDecreasingOrder(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
