

import java.util.Scanner;
public class mergeTwoSortedArray{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the size of the first array :- ");
        int size = input.nextInt();
        int [] arr1 = new int[size];
        arr1 =takingInput(arr1);

        System.out.print("Enter the size of the second array :- ");
        int size1=input.nextInt();
        int [] arr2= new int[size1];
        arr2=takingInput(arr2);

        System.out.println("After merging both array :- ");
        int [] newArr = mergeSortedArray(arr1,arr2);
        for(int i =0;i<newArr.length;i++) {
            System.out.print(newArr[i] + " ");

        }


    }
    public static int[] takingInput (int [] arr){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            System.out.print("Enter the element no " + (i + 1) + " :- ");
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static int [] mergeSortedArray(int [] arr1 , int [] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int [] newArr = new int[n1+n2];

        int i =0 ,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                newArr[k]=arr1[i];
                i++;
                k++;
            }
            else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            newArr[k]=arr1[i];
            k++;
            i++;
        }
        while (j<n2){
            newArr[k]=arr2[j];
            k++;
            j++;
        }
         return newArr;
    }

}