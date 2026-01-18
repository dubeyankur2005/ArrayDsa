import java.util.Scanner;
public class secondMaxNumber {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Welcome to the Finding the Second Maximum Number :- ");
        System.out.print("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        int i = 0;
        while(i<arr.length){
            System.out.print("Enter the "+(i+1)+ " Element of the array :- ");
            arr[i]=input.nextInt();
            i++;
        }
        int smax = findingSecondMaxNo(arr);
        if(smax == Integer.MIN_VALUE){
            System.out.println("Second Max doesn't exist. ");
        }
        else{
            System.out.println("The second max number of the array is : "+ smax );
        }

    }

    public static int findingSecondMaxNo(int [] arr){
        int max  = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        int i =0;
        while(i<arr.length){
            if(max<arr[i]){
                smax=max;
                max= arr[i];
            }
            else if( arr[i] !=max && smax<arr[i]){
                smax=arr[i];
            }
            i++;
        }
        return smax;
    }
}
