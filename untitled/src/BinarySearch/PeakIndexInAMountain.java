// in this code we solve this problem by using neighbour checking technique..

package BinarySearch;
import java.util.Scanner;
public class PeakIndexInAMountain {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int[] arr = new int [size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element no :-" +(i+1)+" ");
            arr[i]=input.nextInt();

        }
        int low = 1;
        int high = arr.length-2;
        int peakIndex=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                peakIndex=mid;
                break;

            }
            else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                low =mid+1;
            }

            else  {
                high = mid-1;
            }


    }

        System.out.println("The index of peak element is " + peakIndex);
        System.out.println("The peak element is "+arr[peakIndex]);
}
}
