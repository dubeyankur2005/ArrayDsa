import java.util.Scanner;

public class PracticeSlidilingWindow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = input.nextInt();

        int[] ans = new int[size - k + 1];

        for (int i = 0; i <= size - k; i++) {
            int max = arr[i];

            for (int j = 1; j < k; j++) {
                max = Math.max(max, arr[i + j]);
            }

            ans[i] = max;
        }

        System.out.println("After Sliding Window:");
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i != ans.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
