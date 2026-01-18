// this code is only run when the array is sorted
// if array is not sorted then first of all we need to sort the array by using...
// ....function Array.sort(arr);

//Lower bound of the target value of first index where the element is GREATER THEN ..
// OR EQUAL To the target value


package BinarySearch;
import java.util.Scanner;
public class LowerBound {
    public static void  main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.println("Enter the size of array :-");
        int size = input.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element :- ");
            arr[i]=input.nextInt();

        }
        System.out.print("Enter the element you want to search :-");
        int target=input.nextInt();

        int lb = arr.length+1;// lb = lower bound
        int low =0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){ // greater or equal then target value
                lb=Math.min(lb,mid); // in lower bound we store Smaller value between lb and mid
                high=mid-1;

            }
            else{             // if(arr[mid]<=target)
                low=mid+1;
            }

        }

        System.out.println("The index of lower bound is "+lb);

    }

}
