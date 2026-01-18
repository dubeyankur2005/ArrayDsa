/*
Problem Statement
    You are given:
    An integer n representing the number of stores.
    An integer array quantities, where quantities[i] is the number of units of product type i.
    You have to distribute all product units among the n stores, satisfying these rules:
      - A store can only receive units from one product type.
      - Each store can receive any number of units of its assigned type (including possibly zero).
      - You must distribute every unit (i.e., use up all quantities).
    Your goal is to minimize the maximum number of units any store receives.
    Return the smallest possible integer x such that you can distribute all products to the n stores so that no
    store has more than x units.
*/

package BinarySearch;
import java.util.Scanner;

public class LeetCode2064 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        // Taking input of array size
        System.out.println("Enter the size of the array :- ");
        int size = input.nextInt();
        int [] arr = new int[size];

        // Taking input of the quantities array
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the element no " + i + " :-");
            arr[i] = input.nextInt();
        }

        // Taking input of the number of stores
        System.out.println("Enter the no of the store : -");
        int n = input.nextInt();

        // Step 1: find maximum value in the array
        // (this is the highest possible capacity any single store may need)
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // Step 2: Apply Binary Search on possible maximum load per store
        int low = 1;      // Minimum possible capacity = 1
        int high = max;   // Maximum possible capacity = max element
        int ans = max;    // Store final answer

        while(low <= high){
            int mid = low + (high - low) / 2; // Guess a capacity

            if(isPossible(mid, arr, n)){
                ans = mid;      // If distribution possible, save answer
                high = mid - 1; // Try for smaller capacity
            }
            else {
                low = mid + 1;  // Otherwise increase capacity
            }
        }

        // Print the minimum possible maximum load
        System.out.println("Minimum maximum load per store = " + ans);
    }

    // Function to check if we can distribute with max load = mid
    public static boolean isPossible(int mid, int[] arr, int n) {
        int stores = 0; // count how many stores are required

        for(int i = 0; i < arr.length; i++){
            int q = arr[i];

            // Distribute q items of current product among stores
            // Each store can take at most 'mid'
            if(q % mid == 0){
                stores += q / mid; // exact division
            } else {
                stores += (q / mid) + 1; // extra store for leftover
            }

            // Early exit: if stores exceed n, return false
            if(stores > n) return false;
        }

        return stores <= n;
    }
}
