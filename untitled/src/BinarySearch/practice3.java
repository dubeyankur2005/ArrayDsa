package BinarySearch;
import java.util.Scanner;
public class practice3 {
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

        int low =0;
        int high = arr.length-1;
        int firstOccurence = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                if(arr[mid]!=arr[mid-1]){
                    firstOccurence = mid;
                    break;

                }
                else{
                    high = mid-1;
                }

            } else if (arr[mid] < target) {
                low=mid+1;
            }
            else high = mid-1;

        }
        System.out.println(firstOccurence);


    }
}
