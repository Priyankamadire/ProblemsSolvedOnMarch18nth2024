
/*all numbers repat twice only two numbers repeat once
 * 2 2 1 3 3 4
 * 1 4 
 * 8 8 9 3 3 0 0  1
 * 9 1
 *
 */
import java.util.*;

public class TwiceNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        solve(n, ar);
    }

    /*
     * public static void solve(int n, int arr[]) {
     * for (int i = 0; i < n; i++) {
     * int cnt = 0;
     * for (int j = 0; j < n; j++) {
     * if (arr[j] == arr[i]) {
     * cnt++;
     * }
     * }
     * if (cnt == 1) {
     * System.out.print(arr[i] + " ");
     * }
     * }
     * }
     */
    public static void solve(int n, int arr[]) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        int r = xor & -xor;

        int x = 0, x2 = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & r) != 0) {
                x = x ^ arr[i];
            } else {
                x2 = x2 ^ arr[i];
            }
        }
        System.out.println(x + " " + x2);
    }
}