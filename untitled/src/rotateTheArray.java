
import java.util.Scanner;
public class rotateTheArray {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the Array rotation :- ");
        System.out.print("Please enter the size of the array :-");
        int size = input.nextInt();
        int [] arr= new int[size];

        // Taking input
        int i =0;
        while(i<arr.length){
            System.out.print("please enter " +(i+1) +" elements of the array :- ");
            arr[i]=input.nextInt();

            i++;
        }

        // taking rotation value
        System.out.print("Now , enter the rotation value : -");
        int value =input.nextInt();
        value %= size ; // in the case of when the user enter the number bigger then size of the array

        rotateElement(arr,value);
        System.out.println("After rotation of the array ");
        System.out.print("[");
        for(int k = 0; k <arr.length; k++){
            System.out.print(arr[k]);
            if(k !=arr.length){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public static void rotateElement(int []arr , int k){
        rotate(arr,0, arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k, arr.length-1);


        }
    public static void rotate(int [] arr , int start, int end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;

        }

        }
    }

