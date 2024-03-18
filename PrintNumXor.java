
/*print 1 to N-1 using xor */
import java.util.*;

public class PrintNumXor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printN(n);
        printNumsAndXor(n);
    }

    public static void printN(int n) {
        int xor = 0;
        for (int i = 1; i < n; i++) {
            xor = xor ^ i;
            System.out.print(xor + " ");
        }

    } // it takes O(n) time

    public static void printNumsAndXor(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println("Number: " + i + ", XOR Result: " + solve(i));
        }
    }

    public static int solve(int n) {
        if (n % 4 == 0) { // O(1)
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else { // n % 4 == 3
            return 0;
        }
    }
}