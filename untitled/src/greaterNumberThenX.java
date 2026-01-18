import java.util.Scanner;
public class greaterNumberThenX {
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array world :- ");
        System.out.print("Enter the size of the array :- ");
        int size =input.nextInt();
        int [] arr = new int [size];
        takingInput(arr);
        System.out.print("Now , please enter the number you want to compare :- ");
        int com=input.nextInt();

        System.out.println("After comparing :-");
        int count =findingNumberFromTheArray(arr,com);
        System.out.println(count);

    }
    public static void takingInput(int [] arr ){
        Scanner input = new Scanner (System.in);
        int i = 0;
        while(i< arr.length){
            System.out.print("please enter the " +(i+1)+ " Elements of the array :- ");
            arr [i]=input.nextInt();
            i++;
        }
    }
    public static int findingNumberFromTheArray(int [] arr , int comp ){
        int count =0;
        int i =0;
        while(i<arr.length){
            if(arr[i]==comp){
                count ++;
                System.out.println(" ( " + arr[i]+" , " +arr[i] + ")");


            }
            i++;
        }
        return count;
    }



}
