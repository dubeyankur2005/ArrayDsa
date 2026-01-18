package BubbleSort;
import java.util.Scanner;
public class IsArrayIsSorted
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element no " + (i+1) + " : ");
            arr[i] = input.nextInt();

        }
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
             flag=false;
             break;
            }
        }
        if(flag==true) System.out.println("The given array is sorted : ");
        else System.out.println("The given array is not sorted ");
    }
}
