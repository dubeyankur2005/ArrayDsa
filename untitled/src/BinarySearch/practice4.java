//Smallest divisor

package BinarySearch;
import java.util.Scanner;
public class practice4 {
    public static void main(String [] args){
        Scanner input  = new Scanner (System.in);
        System.out.println("Enter the size of the array :- ");
        int size= input.nextInt();
        int [] arr = new int[size];

        // taking input
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter the element  :- "+i +" :- ");
            arr[i]=input.nextInt();

        }
        System.out.println("Enter the trashold ");
        int t = input.nextInt();

        int max =arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                max=arr[i+1];
            }

        }
        int low = 1;
        int high= max;
        int d =max;       // d means smallest divisor
        while(low<=high){
            int mid = low+(high-low)/2;
            int sum =0;
            for(int i =0;i<arr.length-1;i++){
                if(arr[i]%mid==0){
                    sum +=arr[i]/mid;

                }
                else sum +=arr[i]/mid+1;
            }
            if(sum<=t){
                d = mid;
                high=mid-1;
            } else  {        // (sum > t)
                low=mid+1;
            }
        }
        System.out.println(d);
    }
}
