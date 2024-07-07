// Q13 in TCS https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-1jVwcJ-aQ5a/#tc_

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        boolean flag = false;
        for (int n = 1; n <= x; n++) {
            for (int z = 1; z <= n; z++) {
                if ((x == (n * a) + z) && n % z == 0) {
                    flag = true;
                    System.out.println(n);
                }
            }
        }
        if (flag == false) {
            System.out.println("None");
        }
        sc.close();
        
    }
}
