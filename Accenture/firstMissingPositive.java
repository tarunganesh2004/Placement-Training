import java.util.*;
public class firstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(firstPositive(a, n));
    }
    
    public static int firstPositive(int[] a, int n) {
        List<Integer> l = new ArrayList<>();
        for (int x : a) {
            if (x > 0) {
                l.add(x);
            }
        }
        int s1 = n * (n + 1) / 2;
        int s = 0;
        for (int i = 0; i < l.size(); i++) {
            s += l.get(i);
        }
        return s1 - s;
    }
}
