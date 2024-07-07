import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        //  4523EF58G
        String r = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'E' && str1.charAt(i + 1) == 'F') {
                i++;
            } else if (str1.charAt(i) == 'G') {
                continue;
            } else {
                r = r + str1.charAt(i);
            }

        }
        
        // Another method
        String res = "";
        res = str1.replaceAll("EF", "");
        res = res.replace("G", "");
        System.out.println(r);
        System.out.println(res);
        sc.close();
    }
}
