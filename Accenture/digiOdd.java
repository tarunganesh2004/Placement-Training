import java.util.Scanner;

public class digiOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        if (N >= 1 && N < 10) {
            res = 9;
        }
        else if (N >= 10 && N < 100) {
            res = 9;
        }
        else if (N >= 100 && N < 1000) {
            res = (N - 100 + 1) + 9;
        }
        else if (N >= 1000 && N < 10000) {
            res = 909;
        }
        else if (N >= 10000 && N < 100000) {
            res=(N-10000+1)+909;
        } else {
            res = 90909;
        }
        System.out.println(res);
        sc.close();
        
    }
}
