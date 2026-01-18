// Check the number is present in the array :-

import java.util.Scanner;
public class findingNumberInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the finding the number in array :- ");
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        int[] arr=new int[size];

        int i =0;
        while(i<arr.length){
            System.out.print("Enter the " + (i+1) +" elements of the array :- ");
            arr [i]=input.nextInt();
            i++;
        }

        System.out.print("Now enter the number you want to search :- ");
        int num = input.nextInt();

        boolean isflag = findingArray(arr, num);
        if(isflag){
            System.out.print("The number is present in the array ");
        }
        else {
            System.out.println(" Sorry,The number is not present in the array :- ");
        }


    }
    public static boolean findingArray(int [] arr ,int num){
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                flag = true;

            }
        }
        return flag;
    }
}
