/*      You are given an array of integers nums and an integer threshold.
        Find the smallest positive integer divisor such that when you divide every element in the array nums by
        this divisor (using ceil division, i.e., ceil(nums[i] / divisor)), the sum of the results is less than
        or equal to threshold.
        Return the smallest such divisor.

 */
package BinarySearch;
import java.util.Scanner;
public class SmallestDivisor {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int [size];

        // taking input of the array
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element no "+i +"  ");
            arr[i] = input.nextInt();
        }

        // taking input of Trashold (Trashold > size of the array)
        System.out.println("Enter the Trashold ( The size of the Trashold must be bigger then size ) :- ");
        int t = input.nextInt();

        int max = -1;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int d=0; // divisor;
        int low = 1;
        int high = max;
        while (low<=high){
            int mid = low+(high-low)/2;
            int sum =0;
            for(int i =0;i<arr.length;i++) {   //   for(int i =0;i<arr.length;i++){
                sum += (arr[i] + mid - 1) / mid;           /* if(arr[i]%mid==0){
               // the above we use ceil division           sum +=arr[i]/mid;
               // instead ceil division we use---->   }
               // this------------->                  else{
                                                      sum += arr[i]/mid+1;
                                                      }
                                                     }*/
            }
            if(sum<=t){
                d =mid;
                high = mid-1;
            }
            else low = mid+1;


        }
        System.out.println(d);


    }

}
