/*   You are given a sorted array arr of size n, a number k, and a target value x.
Your task is to return the k elements from arr that are closest to x.
If two numbers are equally close to x, choose the smaller number.
        The final result should also be in ascending order.   */

package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;
public class KClosest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int [size];
        // taking input of array
        for (int i = 0; i<arr.length;i++){
            System.out.print("Enter the element no " + i +" :- ");
            arr[i]=input.nextInt();

        }
        // taking target
        System.out.println("Enter the target :- ");
        int target = input.nextInt();

        // taking K
        System.out.println("Enter the K :- ");
        int K =input.nextInt();

        // making new arr for returning answer
        int [] brr = new int[K];

        // Case 1 :- basic case if target is lessthen arr[0].
        if (arr[0] > target) {
            for(int i =0;i<K;i++) {

                brr[i] = arr[i];
            }
                Arrays.sort(brr);
                for(int ele :brr){
                    System.out.print(ele + " ");

                }
                return;

        }
        // Case 2 :- Basic case if target is morethen arr[n-1].
        if(arr[arr.length-1]<target){
            for(int i = 0; i<K;i++){
                brr[i] = arr[arr.length-K+i];
            }
            Arrays.sort(brr);
            for(int ele :brr){
                System.out.print(ele + " ");
            }
            return;
        }

        // Now we find Lower Bound for finding target in the array .
        int low =0; int high = arr.length-1;
        int lb = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                lb = mid;
                high =mid-1;
            }
            else low = mid+1;
        }
        // Now after finding Lower Bound we simply use two pointer approach for finding Closest element.
        int i = lb-1;  // First Pointer in the position Lb-1(Lower Bound ).
        int j = lb;    // Second Pointer in the position lb(Lower Bound ).

        int p = 0; // this p is a index for the brr
        while(i>=0 && j<arr.length && K>0){

            int di = Math.abs(target-arr[i]); // di is distance between target and i;
            int dj = Math.abs(target-arr[j]);// dj is distance between target and j;


                if (di <= dj) {
                    brr[p] = arr[i];
                    p++;
                    i--;
                } else {
                    brr[p] = arr[j];
                    p++;
                    j++;
                }
                K--;

        }
        // Now  it is possible that Array end from i or j
        // if array end from i then in brr put remaning j
        while(i>=0 && K>0){
            brr[p]=arr[i];
            p++;
            i--;
            K--;
        }
        while(j< arr.length && K>0){
            brr[p]=arr[j];
            p++;
            j++;
            K--;
        }

        // we short the brr and give a output
        Arrays.sort(brr);  //  For temperorly we using sorting function but after I should write sorting by itself

        for(int ele :brr){
            System.out.print(ele + " ");
        }

    }

}
