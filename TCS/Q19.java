import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int f = fact(n);
        while (f != 0) {
            rem = f % 10;
            if (rem != 0)
                break;
            f = f / 10;
        }
        System.out.println(rem);
        sc.close();
    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}