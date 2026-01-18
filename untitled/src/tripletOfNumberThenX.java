import java.util.Scanner;
public class tripletOfNumberThenX {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of the array :- ");
        System.out.print("Please enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];
        takingInput(arr);

        System.out.print("Enter the number you want to compare :- ");
        int comp = input.nextInt();

        int count = findingTheTripletOfArray(arr,comp);
        System.out.println(comp+" Triplet "+ count + " times in the array .");

    }
    public static void takingInput(int [] arr ){
        Scanner input = new Scanner(System.in);
        int i =0;
        while (i<arr.length){
            System.out.print("Please enter the " + (i+1) +" Element of the array :- ");
            arr[i]=input.nextInt();
            i++;
        }
    }
    public static int findingTheTripletOfArray(int arr[],int comp){
      int count=0;
      for(int i = 0; i<arr.length ; i++){
          for(int j=i+1;j<arr.length ; j++){
              for(int k=j+1;k<arr.length;k++){
                  if(arr[i]+arr[j]+arr[k]==comp){
                      count++;
                      System.out.println("("+ arr[i]+" , "+ arr[j]+" , "+ arr[k]+" ) ");
                  }
              }
          }
      }
       return count ;
    }
}
