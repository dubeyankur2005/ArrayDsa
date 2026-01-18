// write a program to check the array is palindrome by initialization two variable
// and comparing them

import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the palindrome array :- ");
        System.out.print("enter the size of the array :-");
        int size= input.nextInt();
        int [] arr = new int[size];

        int i =0;
        while(i<arr.length){
            System.out.print("Enter the " +(i+1) + " Element of the array :-");
            arr[i]=input.nextInt();
            i++;
        }

        boolean palindrome = isPalindrome(arr,size);
        System.out.println("After checking the array :-");
        if(palindrome){
            System.out.println("This is palindrome array :-");
        }
        else {
            System.out.println("this is not palindrome array :-");
        }
    }
    public static boolean isPalindrome(int [] arr, int size ){
        for(int i =0, j=size-1;i<j;i++,j--) {
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
}
