import java.util.Scanner;
public class occurrences {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the finding Occurrences. ");
        System.out.print("Please enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // taking input
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print("Enter the Elements  no "+ (i+1)+":- ");
            arr [i]=input.nextInt();
        }

        // taking input of finding number :-
        System.out.print("Now enter the number you want to search in array :- ");
        int num = input.nextInt();

        int count = Occurrence(arr , num );
        System.out.println("The "+num+" is present in array " + count+" times :- ");
    }

    public static int Occurrence(int [] arr, int num ){
        int count = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==num){
                count ++;
            }
            i++;
        }
        return count ;

    }
}
