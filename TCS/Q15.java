// TCS Q15

import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int i = 0;
        int j = 0;
        boolean flag = false;
        while (i < N && j < N) {
            int l1 = b + i * a;
            int l2 = d + j * c;
            if (l1 == l2) {
                flag = true;
                System.out.println(l1);
                break;
            } else if (l1 < l2) {
                i++;
            } else {
                j++;
            }
        }
        
        if(!flag) {
            System.out.println("No same amount of fuel found");
        }
        sc.close();
    }
}
