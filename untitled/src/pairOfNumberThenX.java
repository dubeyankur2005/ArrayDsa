import java.util.Scanner;
public class pairOfNumberThenX {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the array :- ");
        System.out.print("Please enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];
        takingInput(arr);

        System.out.print("Please enter the number you want to compare :- ");
        int comp=input.nextInt();
        System.out.println("After comparing :- ");
        int count= findingTheNumberOfTheArray(arr,comp);
        System.out.println(count);


    }

    public static void takingInput(int [] arr ){
        Scanner input = new Scanner (System.in);
        int i = 0;
        while(i<arr.length){
            System.out.print("please enter the "+(i+1)+" element of the array :- ");
            arr [i] =input.nextInt();
            i++;

        }
    }
    public static int findingTheNumberOfTheArray(int [] arr , int com ) {
        int count = 0;
        for(int i =0;i<arr.length ; i++){
            for(int j = i+1; j<arr.length ; j++){
                if(arr[i]+arr[j]==com){
                    count ++;
                    System.out.println(" ( " + arr[i]+" , " +arr[j] + ")");
                }
            }
        }
        System.out.println(count);

            return count;
    }
}
