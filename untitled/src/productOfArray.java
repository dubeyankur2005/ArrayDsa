import java.util.Scanner;
public class productOfArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the multiplication of element of the array :");
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        takingInput(arr);

        int mull = multiplicationOfArray(arr);
        System.out.println("The product of the Element of the array is = " + mull);

    }
    public static void takingInput(int [] arr){
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i<arr.length){
            System.out.print("Enter the " + (i+1)+ "Element of the arrays : ");
            arr [i]=input.nextInt();
            i++;

        }
    }
    public static int multiplicationOfArray(int [] arr){
        int mul =1;
        int i = 0;
        while(i < arr.length){
            mul *=arr[i];
            i++;

        }
         return mul;
    }


}

