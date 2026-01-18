//                         METHOD 1
// In this code we sort the array of 0'S and 1'S with the help of Two for loop


import java.util.Scanner;
public class SortArray0Sand1S {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :-");
        int size = input.nextInt();
        System.out.println("Please enter the only 0 and 1 ");
        int [] arr = new int[size];

        // Taking input for the array
        for(int i = 0; i<arr.length;i++){
            System.out.print("Enter the element no "+(i+1)+" ");
            arr[i]=input.nextInt();

        }

        // counting the number of zero present in the array

        int noOfZeroes = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                noOfZeroes++;
        }

        // Now putting the 0 and 1 in the array

        for(int i=0;i<arr.length;i++){
            if(i< noOfZeroes) {
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }

        // output
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }



}
