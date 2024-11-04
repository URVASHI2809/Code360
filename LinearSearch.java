package Code360;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int n, int num, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("n = " + n + ", num = " + num);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = linearSearch(n, num, arr);
        System.out.println(result);

        scanner.close();
    }
}
