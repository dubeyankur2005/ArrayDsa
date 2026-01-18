// here we finding the target element in rotate array ....


package BinarySearch;
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of the array :-");
        int size = input.nextInt();
        int[] arr = new int [size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element no :-" +(i+1)+" ");
            arr[i]=input.nextInt();

        }
        System.out.print("Now enter the element you want to search :-");
        int target=input.nextInt();

        int low =0;
        int high=arr.length-1;
        // pivot means where from the array decrease ( largest element)
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low =mid+1;
            } else if (arr[mid] > arr[mid + 1]) {
                high =mid;
            }


        }
        int pivot = low;


        // step 2 : Search the correct half
        int index =-1;
        if(arr[pivot]==target){
            index = pivot;
        }
        else if (target<=arr[arr.length-1]) {
            index= SearchingTarget(arr,pivot+1,arr.length-1,target);


        }
        else if (target >=arr[arr.length - 1]){
            index =  SearchingTarget(arr,0,pivot-1,target);
        }

        // step 3 : output
        if (index != -1){
            System.out.println(index);
        }
        else System.out.println("the element is not present in array ");




    }
    public static int SearchingTarget(int [] arr,int low, int high,int target){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid] < target) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }


        }

        return -1;

    }
}
