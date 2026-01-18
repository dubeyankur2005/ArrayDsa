package BinarySearch;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
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
        boolean flag=false;
        int index=-1;             // to store the found index
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target){
                flag=true;
                index=mid;        // here we store the index
                break;
            } else if (arr[mid]<target) {
                low=mid+1;
            } else if (arr[mid]>target) {
                high=mid-1;
            }

        }
        if(flag==true) System.out.println("The element is present at index "+index);
        else System.out.println("The element is not present in the array");
    }
}
