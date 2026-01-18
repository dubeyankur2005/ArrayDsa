import java.util.Scanner ;
public class ArrayIsSorted1 {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // Taking Input
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter the elements of the array "+(i+1)+" :- ");
            arr[i]=input.nextInt();
        }
        CheckingArray(arr);
    }
    public static void CheckingArray(int[] arr){
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for(int i=0;i<arr.length-1;i++){
            if (arr[i] < arr[i+1]){        //If the current element is less than the next, then it cannot be decreasing.
                isDecreasing =false;      // Example: 3 < 5 → So it’s not decreasing, so set isDecreasing = false.
            }
            if(arr[i] > arr[i+1]){       // If the current element is greater than the next, then it cannot be increasing.
                isIncreasing =false;    // Example: 5 > 3 → So it’s not increasing, set isIncreasing = false

            }
        }
        if (isIncreasing) System.out.println("The array is sorted in increasing order .");
        else if (isDecreasing) System.out.println("The array is sorted in decreasing order .");
        else System.out.println("The array is not sorted .");
    }

}
