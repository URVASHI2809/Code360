package Code360;

import java.util.Scanner;

public class LargestElement {
    static int largestElement(int[] arr, int n) {
        int maxElement = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = largestElement(arr, n);
        System.out.println(result);

        scanner.close();
    }
}
