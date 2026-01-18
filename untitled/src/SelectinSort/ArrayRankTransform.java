//Given an array of N distinct elements, transform the array so that all elements are replaced by their
// corresponding ranks in the sorted order. The ranks should be in the range 0 to N-1, where:
//0 is assigned to the smallest element,
//1 is assigned to the second smallest element,
//...
//N-1 is assigned to the largest element.

//The relative order of the elements in the original array must be preserved.
//✅ Example:
//Input: arr = [20, 15, 40, 10]
//Sorted order = [10, 15, 20, 40]
//Ranks = {10 → 0, 15 → 1, 20 → 2, 40 → 3}
//
//Output: [2, 1, 3, 0]
package SelectinSort;
import java.util.Scanner;
public class ArrayRankTransform {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of the array :-");
        int size=input.nextInt();
        int [] arr=new int[size];

        // input
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element no "+(i+1)+" : ");
            arr[i]=input.nextInt();
        }
        int negative=0;
        for(int i=0;i<arr.length;i++){
            int min =Integer.MAX_VALUE;
            int minIndex=0;

            for(int j = 0; j <arr.length; j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    minIndex=j;

                }
            }
            arr[minIndex]=negative;
            negative--;
        }
        for(int i = 0; i<arr.length;i++){

            arr[i]*=(-1);
        }
        // output
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
