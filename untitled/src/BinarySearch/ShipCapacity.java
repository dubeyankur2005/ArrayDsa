/*
Problem Statement – Ship Capacity
        You are given an array weights where weights[i] represents the weight of the i-th package, and an integer days
        representing the number of days in which all packages must be shipped.
        You must ship the packages in the given order (you cannot rearrange them). Each day,
        the ship can carry packages whose total weight does not exceed some fixed capacity.
        Return the minimum ship capacity such that all packages can be shipped within the given number of days.
*/
/*
Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
        Output: 15
        Explanation:
        A ship capacity of 15 is the minimum to ship all packages in 5 days like this:
        Day 1: [1,2,3,4,5]
        Day 2: [6,7]
        Day 3: [8]
        Day 4: [9]
        Day 5: [10]
*/



package BinarySearch;
import java.util.Scanner;
public class ShipCapacity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :-");
        int size= input.nextInt();
        int [] arr = new int[size];

        // taking input of the array
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter the element no "+ i + " :- ");
            arr[i]=input.nextInt();
        }
        // taking input of the days for the shipping the goods
        System.out.println("Enter the days ");
        int day = input.nextInt();

        // Step 1 :- first of all we find max of the array because max is the minimum capacity in case :-
        // and find sum of the array because it is the maximum capacity

        int max = arr[0];
        int sum =0;
        for(int i = 0;i<arr.length;i++){
            if (arr[0]<arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }

        // Step 2:- now we apply binary search

        int low = max;  // max of the array is minimum capacity for a days
        int high = sum; // sum of the array is maximum capacity for a days
        int minC = max; // Minimum capacity
        while(low<=high){
            int mid = low+(high-low)/2;
            if(ispossiable(mid,arr,day)){
                minC = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }

        }

    }
    public static boolean ispossiable(int mid,int [] arr,int day){
        int maxC =mid; // mid = maximumCapacity
        int days=1;// Start with day 1;
        int load = 0; // current capacity on the ship
        for(int i =0;i<arr.length;i++){
            if(load+arr[i]<=maxC){
            load +=arr[i];    // add package on the current ship
            }
            else{
                load = arr[i]; // new ship(new days start)
                days++;    //
            }
        }
        return days<=day; /*This simply means: If the days we actually needed ≤ the days we are allowed,
                                   ✅ Possible → return true.
                                             Otherwise,
                                   ❌ Not possible → return false.
*/
    }
}
