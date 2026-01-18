// Write the program to copy the content of one array into another in the reverse order.

import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args ){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the reversing of the array :- ");
        System.out.print("Enter the size of the array :- ");
        int size= input.nextInt();
        int [] arr = new int[size];
// taking input
        int i=0;
        while(i<arr.length ){
            System.out.print("Enter the "+(i+1)+"element of the array :- ");
            arr[i]=input.nextInt();
            i++;
        }

//        // reversing array b
        int [] brr =new int[size];
        int j=0;
        while(j<arr.length){
            brr[j]=arr[size-1-j];
            j++;
        }
//        // printing array b
        int k = 0;
        while(k<size){
            System.out.print(brr[k] +" ");
            k++;
        }

    }


}
