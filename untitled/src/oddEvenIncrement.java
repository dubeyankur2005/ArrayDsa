import java.util.Scanner;
public class oddEvenIncrement {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Increment of the array :- ");
        System.out.print("Enter the size of the array :-  ");
        int size = input.nextInt();
        int [] arr = new int[size];
        takingInput(arr);
        incrementInArray(arr);

        System.out.println("Updated array :-");
        int i =0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }


    }
    public static void takingInput(int [] arr ){
        Scanner input = new Scanner(System .in);
        int i = 0;
        while (i<arr.length){
            System.out.print("Enter the " + (i+1) + " elements of the arrays :-  ");
            arr[i]=input.nextInt();
            i++;

        }
    }
    public static void incrementInArray(int [] arr){
        int i =0;
        while(i<arr.length){
            if(i%2==0){
                arr[i] *=2;
            }
            else{
                arr[i] += 10;
            }
            i++;
        }
    }
}
