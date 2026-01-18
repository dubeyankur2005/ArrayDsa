// W.A.P to return new array after deleting a specific element.
import java.util.Scanner;
public class deleteElementOfArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int [] arr = new int [size];

        // taking input
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i]= input.nextInt();

        }
        System.out.print("Now Enter the element you want to delete : ");
        int del = input.nextInt();

        int count = occurrences(arr,del); // Finding how many times the number is  present int array.
        if(count == 0 )    // If element not present in array .
            System.out.println("Element not found in the array.");
        else {
           int [] result= DeletingArray(arr, del, count);
            System.out.print("[");
           for(int i=0;i<result.length;i++){
               System.out.print(result[i]+",");
           }
            System.out.print("]");
        }

    }
    public static int occurrences(int[] arr ,int num){
        int count =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }


        return count ;
    }
    public static int [] DeletingArray(int [] arr ,int del ,int count){
        int [] brr = new int[arr.length -count];
        int index =0; // this index is for new array brr for avoiding out of bound.
        for(int i =0 ;i< arr.length;i++){
            if(arr[i]!= del){
                brr[index]=arr[i];
                index++;
            }

        }

        return brr;
    }
}
