import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        transaction(a);
        sc.close();
    }

    public static void transaction(int[] a) {
        int change_30 = 0, change_60 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 30) {
                change_30++;
            } else if (a[i] == 60) {
                if (change_30 > 0) {
                    change_30--;
                    change_60++;
                } else {
                    System.out.println("Transaction Failed");
                    return;
                }
            } else if (a[i] == 120) {
                if (change_30 > 0 && change_60 > 0) {
                    change_30--;
                    change_60--;
                } else if (change_30 >= 3) {
                    change_30 -= 3;
                } else {
                    System.out.println("Transaction Failed");
                    return;
                }
            }
        }
        System.out.println("Transaction Successful");
    }
}
