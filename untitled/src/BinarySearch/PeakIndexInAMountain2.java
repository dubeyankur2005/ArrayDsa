// In this code we solve the problem by slope-based method
//.... because we know in peak index in mountain array firstly the element is...
//....increases then it strictly decreases

package BinarySearch;
import java.util.Scanner;
public class PeakIndexInAMountain2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element no :-" + (i + 1) + " ");
            arr[i] = input.nextInt();

        }
        int low = 1;
        int high = arr.length-2;
        while(low<high){
            int mid =(low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low =mid+1;
            }
            else if (arr[mid]>arr[mid+1]){
                high = mid;
            }



        }
        System.out.println("The index of peak element is "+low);
        System.out.println("The peak element is "+arr[low]);



    }
}
