import java.util.Scanner;
public class sumOfArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sum of the array : ");
        System.out.println("Please enter the size of the array : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        takingInputOfArray(size,arr);

        int sum =calculateSum(arr);
        System.out.println("The sum of the array is : " + sum);


    }
    public static void takingInputOfArray(int size , int[] num){
        Scanner input = new Scanner(System.in);
        int i =0;
        while(i< num.length){
            System.out.print("Enter the "+ (i+1)+" element of the array : ");
            num[i]=input.nextInt();
            i++;
        }

    }

    public static int calculateSum(int [] num){
        int sum =0;
        int i =0;
        while(i< num.length){
            sum +=num[i];
            i++;
        }
        return sum;
    }




}
