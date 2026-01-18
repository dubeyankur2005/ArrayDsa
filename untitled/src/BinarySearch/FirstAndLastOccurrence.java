// Finding the first and last occurrence of the given target in the array

package BinarySearch;
import java.util.Scanner;
public class FirstAndLastOccurrence {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int [size];

        // taking input of the array :-
        for(int i = 0; i<arr.length;i++){
            System.out.print("Enter the element "+(i+1)+":- ");
            arr[i] = input.nextInt();

        }

        // taking input of the target
        System.out.println("Enter the element which want to you search :- ");
        int target = input.nextInt();

        // Step 1 :- checking is the target is present or not ;
        int low =0;
        int high = arr.length-1;
        boolean flag = false; // assuming the element is not present int the array
        while(low<=high){
            int mid = low+(high-low)/2;
                if(arr[mid]== target){
                    flag = true; break;
                } else if (arr[mid] < target) {
                    low = mid+1;
                } else if (arr[mid] > target) {
                    high=mid-1;
                }


            }
        if(flag==false){
            System.out.println("The element is not present in the array :- ");
        }
        else {

            int firstIndex = LowerBound(arr, target);
            int lastIndex = UpperBound(arr, target) - 1;

            System.out.println("[ " + firstIndex + " , " + lastIndex + " ]");
        }



        }
    // if element is present then we find the lower bound 0f the target
    // by finding lower bound of the target we find first occurrence

    public static int LowerBound(int []arr,int target){
        int low = 0;
        int high = arr.length-1;
        int LowerBound =arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                LowerBound = mid;
                high =mid-1;
            }
            else if (arr[mid] < target) {
                low = mid+1;
            }

        }



        return LowerBound;
    }

    // After finding lower bound we are going to find the upper bound of the target

    public static int UpperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int upperBound=arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target){
                upperBound=mid;
                high=mid-1;

            }
            else  {
                low=mid+1;
            }

        }



        return upperBound;
    }
}





