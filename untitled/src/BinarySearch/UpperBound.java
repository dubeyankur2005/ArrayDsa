// upper bound of the target is strictly GREATER then the target value


package BinarySearch;
import java.util.Scanner;
public class UpperBound {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size=input.nextInt();
        int [] arr=new int [size];

        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element no :- ");
            arr[i]=input.nextInt();

        }
        System.out.println("Enter the element you want to search :- ");
        int target=input.nextInt();

        int ub = arr.length; // in upper bound we store size of the array
        int low =0;
        int high = arr.length-1;
        while(low<=high) {
            int mid= low+(high-low)/2;
            if(arr[mid]>target){     // strictly greater then target;
                ub = mid;
                high=mid-1;
            }
            else{            // if (arr[mid]<target)
                low=mid+1;
            }

        }
        System.out.println("The upper bound is " +ub);
    }
}
