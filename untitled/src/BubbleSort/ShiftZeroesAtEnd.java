// Move all zeroes at the end of the array
package BubbleSort;
import java.util.Scanner;
public class ShiftZeroesAtEnd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = input.nextInt();
        int [] arr = new int[size];
//input
        int noOfZeroes =0;
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element no "+(i+1) +" ;");
            arr[i]=input.nextInt();
            if(arr[i]==0) noOfZeroes++;
        }

        for(int x = 0;x<noOfZeroes;x++){
            for(int i=0;i<arr.length-1-x;i++){
                if(arr[i]==0){
                    int swap = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]= swap;
                }
            }
        }
        //output
        for(int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
