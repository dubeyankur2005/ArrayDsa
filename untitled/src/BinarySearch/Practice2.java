
// lower bound
package BinarySearch;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element :- ");
            arr[i] = input.nextInt();

        }
        System.out.println("Enter the Target :-");
        int target = input.nextInt();

        int low =0;
        int high = arr.length-1;
        int lb = arr.length+1;
        while(low<=high){
            int mid = low+(high-low);
            if(arr[mid]>=target){
                lb =Math.min(lb,mid);
                high = mid-1;
            } else if (arr[mid] <= target) {
                low = mid+1;
            }


        }

        System.out.println(lb);


    }


}
