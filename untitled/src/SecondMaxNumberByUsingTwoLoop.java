import java.util.Scanner;
public class SecondMaxNumberByUsingTwoLoop {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the finding Second Maximum number :-");
        System.out.print("Enter the size of the array :- ");
        int num = input.nextInt();
        int [] arr = new int[num];

        // Taking input of array:-
        int i =0;
        while(i<arr.length){
            System.out.print("Enter the " +(i+1) + " element of the array :- ");
            arr[i]=input.nextInt();
            i++;
        }

        int smax = secondMaxNO(arr);
        if(smax==Integer.MIN_VALUE){
            System.out.println("Second max number doesn't exist.");
        }
        else {
            System.out.print("The Second Maximum number of the array is " + smax);
        }
    }

    public static int secondMaxNO(int [] arr){
        int max  = Integer.MIN_VALUE ;
        int smax = Integer.MIN_VALUE ;

        int i =0;
        while(i<arr.length){
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }

        // here we find our maximum number
        // so we no find our second maximum number

        int j =0;
        while(j<arr.length){
            if(arr[j] != max && smax<arr[j]){
                smax = arr[j];
            }
            j++;

        }

        return smax;
    }

}
