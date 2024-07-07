import java.util.Scanner;

public class maximumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // first range
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        if (r1 > 0 && r2 > 0) {
            p1 = r1 * r2;
        } else if(l1<0 && r2<0){
            p2 = l1 * r2;
        } else if(r1<0 && l2<0){
            p3 = r1 * l2;
        } else if (l1 < 0 && l2 < 0) {
            p4 = l1 * l2;
        }
        int r=0;
        r = Math.max(r, Math.max(p1, Math.max(p2, Math.max(p3, p4))));
        System.out.println(r);
        sc.close();
    }
}
