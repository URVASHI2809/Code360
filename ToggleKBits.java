package Code360;

import java.util.Scanner;

public class ToggleKBits {
        public static int toggleKBits(int n, int k) {
            int mask = (1 << k) - 1;
            return n^mask;
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();

            for(int t= 0; t < T; t++){
                int N = scanner.nextInt();
                int K = scanner.nextInt();

                int result = toggleKBits(N, K);

                System.out.println(result);
            }
            scanner.close();
        }
}

//input: 2
//21 3
//output: 18
