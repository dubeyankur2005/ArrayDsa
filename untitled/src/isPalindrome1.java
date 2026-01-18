// Checking array is palindrome by reversing array method .

import java.util.Scanner;
public class isPalindrome1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome :-");
        System.out.print("Enter the size of the element :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // Taking input
        int i =0;
        while(i<arr.length){
            System.out.print("Enter the " +(i+1)+" elements of the array :- ");
            arr[i]=input.nextInt();
            i++;
        }

        // after checking the palindrome
        boolean palindrome=isPalindrome(arr,size);
        if(palindrome){
            System.out.println("This is palindrome array :-");
        }
        else{
            System.out.println("this is not palindrome array :-");
        }

    }
    public static boolean isPalindrome(int []arr, int size){
        int [] brr = new int[size];
        for(int i =0;i<arr.length;i++){
            brr[i]= arr[size - 1-i];
            if(arr[i]!=brr[i]){
                return false;
            }
        }


        return true;
    }

}
