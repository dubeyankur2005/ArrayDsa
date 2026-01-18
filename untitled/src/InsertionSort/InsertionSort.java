package InsertionSort;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = input.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element no " + (i+1) +" : ");
            arr[i] = input.nextInt();
        }
        for (int i=1;i<arr.length;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else{
                    break;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
