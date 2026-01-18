import java.util.Scanner;
public class MarksLessThen35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array world :");
        System.out.print("Please enter the length of the array :");
        int size = input.nextInt();
        int[] num=new int[size];
        InputArrays(num);
    }
    public static int [] InputArrays(int[] num){
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < num.length){
            System.out.print("Enter the "+(i+1) + " element of the array.");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }


}
