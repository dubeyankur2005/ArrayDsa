// Find the missing number in array from 1 to size.

import java .util.Scanner;
public class findingMissingElementInArray {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size-1];

        int i= 0;
        while(i<arr.length){
            System.out.print("Please enter Element " + (i+1) + "  of the array :- ");
            arr[i]=input.nextInt();
            i++;
        }
        int missingNumber =findingMissingNumber(arr,size);
        System.out.println(" The Missing Number is " + missingNumber);
    }
    public static int findingMissingNumber(int [] arr , int size){
        int totalSum =0;
        for(int i =0;i<arr.length;i++){
            totalSum +=arr[i];

        }
        int missingNumber = size*(size + 1) / 2;
        missingNumber -=totalSum;
        return missingNumber;
    }
}
