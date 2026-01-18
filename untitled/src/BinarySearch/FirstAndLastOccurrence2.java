
//  in this code for finding the lower and upper bound without using Lower and Upper bound
package BinarySearch;
import java.util.Scanner;
public class FirstAndLastOccurrence2 {
    public static void main(String[] arg){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array : -");
        int size = input.nextInt();
        int [] arr = new int[size];

        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element no "+i);
            arr[i]=input.nextInt();

        }
        System.out.println("enter the element you want to search ");
        int target = input.nextInt();


        int low =0;
        int high = arr.length-1;
        int firstPosition=-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                firstPosition = mid;
                high =mid-1;
            } else if (arr[mid] < target) {
                low = mid+1;
            }
            else high=mid-1;

        }
        int low1=0;
        int high1=arr.length-1;
        int lastPosition=-1;
        while(low1<=high1){
            int mid = low1+(high1-low1)/2;
            if(arr[mid]==target){
                lastPosition = mid;
                low1=mid+1;
            } else if (arr[mid] < target) {
                low1=mid+1;
            }
            else high1=mid-1;
        }

    }


}
