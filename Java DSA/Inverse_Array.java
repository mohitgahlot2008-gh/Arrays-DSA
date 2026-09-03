import java.util.*;

public class Main {
    public static void inverse(int[] arr, int[] inv, int idx) {
        if (idx == arr.length)
            return;
        inv[arr[idx]] = idx;
        inverse(arr, inv, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        inverse(arr, inv, 0);
        for (int i = 0; i < n; i++) {
            System.out.print(inv[i] + " ");
        }
        sc.close();
    }
}
