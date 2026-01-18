package BinarySearch;
import java.util.Scanner;
public class TargetInRotateArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int [size];

        // input Array
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the size element :- ");
            arr[i] = input.nextInt();
        }
        // taking target
        System.out.print("Now please enter the target value :- ");
        int target = input.nextInt();

        // finding largest element in rotated array
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int mid = low +(high-low)/2;
            if(arr[mid]<arr[mid+1]){     // if mid is less then mid+1 then target lies..
                low = mid+1;            //... after mid
            }
            else high =mid;     // arr[mid]>arr[mid+1];

        }
        int pivot = low;       // largest element of the rotated array

        // step 2 :- calling findingTarget
        int index =-1;       // in case if target is not present in the array
        if(arr[pivot]==target){   // Case 1 :- if largest element is the target
            index = pivot;
        }
       else if(target<=arr[0]){ // Case 2 :- if target is bigger then first element of the..
                                // .......array then target is present in left sorted array

            index =FindingTarget(arr,0,pivot-1,target);
        }
       // Case 3 :- if target is smaller then the first element then the target is present..
        //.......... in the Right Sorted part of the array .
       else index = FindingTarget(arr,pivot+1,arr.length-1,target);


       // output

        if(index !=-1)
        System.out.print("The target found in index no :- " +index);

        else System.out.print("The target is not found in array ");


    }
    public static int FindingTarget(int [] arr,int low, int high, int target){
        // simple code of binary search
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid] < target) {
                low = mid+1;
            }
            else high = mid-1; // arr[mid]>target

        }

        return -1;
    }
}
