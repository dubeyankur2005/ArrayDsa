// W.A.P to sort an array in decreasing order using bubble sort
package BubbleSort;
import java.util.Scanner;
public class SortInDecreasingOrder {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int [] arr =new int[size];

        for(int i =0;i<arr.length;i++){
            System.out.print("Enter the element no "+(i+1)+" : ");
            arr[i]=input.nextInt();
        }
        boolean swap = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+i];
                    arr[i+i]=temp;
                    swap =true;

                }
                if(swap==false) break;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
