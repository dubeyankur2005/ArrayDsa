// write a program to reverse same array without using another array .

import java.util.Scanner;
public class reverseArray2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the reversing the array .");
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // taking input
        int i = 0;
        while(i<arr.length){
            System.out.print("Enter the " +(i+1) + " element of the array :- ");
            arr[i]= input.nextInt();
            i++;
        }
        reverseArray(arr,size);
        System.out.println("After reversing the array :-");
        System.out.print("[ ");
        for(int j =0;j<arr.length;j++){
            System.out.print(arr[j]);
            if(j!=size-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

    }
    public static void reverseArray(int [] arr , int size){
        for(int i = 0, j=size - 1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }



}
