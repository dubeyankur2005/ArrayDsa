package BubbleSort;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = input.nextInt();
        int[] arr = new int[size];
// input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element no " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        // this is sort some type of array ex -> [2,1,5,4] for further detail refers dsa notebook.
      /*  for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int swap = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = swap;
            }
        }
        // this code sort every type of array but it's not fully opitmize for further detail refer dsa notebook
        for (int x = 0; x < arr.length-1; x++) {
            for (int i = 0; i < arr.length - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                }
            }
        }*/
        // fully optimize
        for (int x = 0; x < arr.length-1; x++) {
            boolean swapped = false; // now swapped is not happened
            for (int i = 0; i < arr.length -1- x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                    swapped = true;
                }
            }
           if(swapped == false) break; // when swapped not happen it's means array is sorted.
        }
        // output
        for(int ele : arr){
            System.out.print(ele +" ");
        }

    }
}
/* explaintion of full optimize code
for (int x = 0; x < arr.length; x++) {
            for (int i = 0; i < arr.length-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                }
            }
            boolean flag = true;
            for (int i = 0; i<arr.length ;i++)
            if (arr[i] < arr[i+1]){
            flag = false;
            break;
            }
 */