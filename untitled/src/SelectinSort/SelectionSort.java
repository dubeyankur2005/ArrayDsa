package SelectinSort;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int size  = input.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element no "+(i+1)+" : ");
            arr[i]=input.nextInt();

        }

        // selection sort
        for(int i=0;i<arr.length-1;i++){
            int min =Integer.MAX_VALUE;
            int minIndex=0;                   // here we store index of min value
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;

                }
            }
            // swapping the index of min value to first index
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]= temp;
        }
        // output
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
}
