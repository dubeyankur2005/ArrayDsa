//  Merge three array
// Hint :- step 1 merge first and second array and store in temp
//         step 2 merge temp and third array and store in newArray.

import java.util.Scanner;
public class mergeThreeArray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
            System.out.print("Enter the size of the first array :- ");
            int size1 = input.nextInt();
            int[] arr1 = new int[size1];
            takingInput(arr1);

            System.out.print("Enter the size of the second array :-");
            int size2=input.nextInt();
            int [] arr2 = new int [size2];
            takingInput(arr2);

            System.out.print("Enter the size of the third array :-");
            int size3=input.nextInt();
            int [] arr3 = new int [size3];
            takingInput(arr3);

            //step1:- merge arr1 and arr2 and store in temp array
            int [] temp =mergeArray(arr1,arr2);

            //step2:- merge temp array and arr3 and store in final array
            int []finalArr=mergeArray(temp,arr3);

            // for Displaying final Array (output)
            System.out.println("After merging the sorted array :- ");
            System.out.print("[");
            for(int i=0;i<finalArr.length;i++){
            System.out.print(finalArr[i] + ",");
        }
            System.out.print("]");

    }
    public static int[] takingInput(int []arr){
        Scanner input= new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            System.out.print("Enter the element no " + (i + 1)+" :");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static int [] mergeArray(int [] arr , int [] brr){
        int n1=arr.length;
        int n2=brr.length;
        int[] newArr = new int[n1+n2];
        int i=0;                              // int i for first arr
        int j=0;                              // int j for second arr
        int k=0;                              // int k for final arr
        while(i<n1 && j<n2){
            if(arr[i]<brr[j]){
                newArr[k]=arr[i];
                i++;
                k++;
            }
            else{
                newArr[k]=brr[j];
                j++;
                k++;
            }
        }

        // if both arr is hava same no of element then the both while loop in useless.

        // this loop run only when the arr1 is bigger then second array.
        while(i<n1){
            newArr[k]=arr[i]; // here we storing all the rest element of the arr1 to new array
            i++;
            k++;
        }
        // this loop run when the arr2 is bigger then third array.
        while(j<n2){
            newArr[k]=brr[j]; // we storing all the rest element of the arr2 to new array
            j++;
            k++;
        }
        return newArr;
    }
}
