package BinarySearch;
import java.util.Scanner;
public class LeetCode2064SecondApproach {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // taking input of the array
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element no " + i +" :- ");
            arr[i] = input.nextInt();
        }

        // Taking input of number of stores
        System.out.println("Enter the number of the stores : - ");
        int n = input.nextInt();

        //  Step 1: find maximum value in the array
        //         (this is the highest possible capacity any single store may need)
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(max<=arr[i])  max = arr[i];
        }

        // binary search
        int low = 1 ; // Minimum capacity any single store may need
        int high = max ; // Maximum capacity any single store may need
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(ispossiable(mid,arr,n)){
                ans =mid;
                high = mid-1;
            }
            else  low = mid+1;
        }
        System.out.println("Minimum Maximum load pr store :- "+ ans);
    }

    public static boolean ispossiable(int mid ,int[] arr,int n){
        int storeCapacity = 0;
        for(int i = 0 ; i<arr.length;i++){
            storeCapacity += (arr[i]+mid-1)/2;
        }
        // early stop
        if(storeCapacity>n) return false;

    return storeCapacity >= n; // return true;
    }

}
