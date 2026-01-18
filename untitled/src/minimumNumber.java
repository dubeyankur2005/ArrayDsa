import java.util.Scanner;
public class minimumNumber {
    public static void main(String[] args ){
        Scanner input =new Scanner (System.in);
        System.out.println("Welcome to the minimum number calculator of the array : ");
        System.out.print("Please enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr= new int[size];

        takingInput(arr);

        int min = minimumNumber(arr);
        System.out.println("The minimum number of the array is :- "+min);

    }
    public static void takingInput(int[] arr){
        Scanner input = new Scanner(System .in );
        int i=0;
        while(i<arr.length){
            System.out.print("Please enter the "+(i+1) +" element of the array :-");
            arr[i] = input.nextInt();
            i++;
        }
    }
    public static int minimumNumber(int[] arr ){
        int min=arr[0];
        int i =1;
        while(i<arr.length){
            if(min>arr[i]){
                min= arr[i];
            }
            i++;
        }

        return min;
    }

}
