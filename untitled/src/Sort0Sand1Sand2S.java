//                             METHOD 3
// Here we sorted 0 1 2 with simple logic

import java.util.Arrays;
import java.util.Scanner;
public class Sort0Sand1Sand2S {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        System.out.println("Please enter only 0,1 and 2 ");
        int[] arr = new int [size];

        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element no " + (i+1)+" : ");
            arr[i]= input.nextInt();

        }
        int noOfZeros =0;
        int noOfones =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0) noOfZeros++;
            if(arr[i]==1) noOfones++;
        }
        for(int i =0 ;i<arr.length;i++){
            if(i<noOfZeros) arr[i]=0;
            else if(i<noOfZeros+noOfones) arr[i]=1;
            else arr[i]=2;

        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
