import java.util.Scanner;
public class practice{
    public static void main(String [] args ){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the ArmsStrong number identifier :-");
        System.out.print("Please enter the number :- ");
        int num = input.nextInt();
        boolean isArmsStrong=isArmsStrong(num);
        if (isArmsStrong){
            System.out.println("The given number is ArmsStrong number :- ");
        }
        else{
            System.out.println("Sorry , the given number is not ArmsStrong number :-");
        }

    }
    public static boolean isArmsStrong(int num){
        int numCpy = num;
        int digits = noOfDigits(num);
        int add = 0;
        while(num>0){
            int lastDigit = num%10;
            num /=10;
            add = add +pow(lastDigit , digits);

        }

        return add == numCpy ;
    }
    public static int pow(int digits , int pow ){
        int result = 1;
        int i=0;
        while (i<pow){
            result *= digits;
            i++;
        }
        return result ;
    }

    public static int noOfDigits ( int num ){
        int digit = 0;
        while (num>0){
            digit ++;
            num /=10;
        }
        return digit;
    }


}
