//                     METHOD 2
// now we sort array by using Two pointer approach .

import java.util.Scanner;
public class sort0Sand1S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        System.out.println("Please enter only 0 and 1");
        int[] arr = new int [size];

        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the element no " + (i+1)+" : ");
            arr[i]= input.nextInt();

        }


        int low =0;
        int high = arr.length-1;
        while(low<=high){
            if(arr[low]==0){
                low ++;
            }
            else if(arr[high]==1){
                high--;
            }
            else if(arr[low]==1 && arr[high]==0){
                arr[low]=0;
                arr[high]=1;
            }

        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
