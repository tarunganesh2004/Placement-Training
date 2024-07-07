import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        find(H, M);
        sc.close();
        
    }

    public static void find(int H, int M) {
        if (H >=24) {
            int r = H %24;
            System.out.println(String.format("%02d::%02d", r, M));
        }
        else {
            int h = 24 - H;
            int m = (60-M)%60;
            if(m>0){
                h=(h-1)%24;
            }
            System.out.println(String.format("%02d::%02d", h, m));
        }
    }
}
