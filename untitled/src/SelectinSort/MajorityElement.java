// W.A.P To find the majority element in a given array nums.
// The majority element is defined as the element that appears more than ⌊n / 2⌋ times, where n is the size of the array.
// for this question I am using selection sort;
package SelectinSort;
import java.util.Scanner;
public class MajorityElement {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the size of the array :-");
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element no " +(i+1)+" : ");
            arr[i]=input.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int minIndex=0;
            for(int j=i;j<arr.length-1;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIndex=j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        int majorityElement=arr[arr.length/2];
        System.out.println("majority element : "+majorityElement);
    }
}
