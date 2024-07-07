import java.util.*;

class node {
    int data;
    node next;

    node(int n) {
        data = n;
        next = null;
    }

}

public class reverseKNodes {
    static node head = null;

    public static void insert(int n) {
        node newNode = new node(n);
        if (head == null) {
            head = newNode;
        } else {
            node cur = head;
            while (cur.next != null) {
                cur = cur.next;

            }
            cur.next = newNode;
        }
    }

    public static node reverseK(node head, int k) {
        int c = 0;
        node cur = head;
        node prev = null;
        node ne = null;
        while (cur != null && c < k) { // reverse k nodes
            ne = cur.next;
            cur.next = prev;
            prev = cur;
            cur = ne;
            c++;
        }
        if (ne != null) {
            head.next = reverseK(cur, k); 
        }
        return prev;
    }
    public static void print(node head) {
        node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // insert(sc.nextInt());
            int x = sc.nextInt();
            if (x == -1) {
                break;
            } else {
                insert(x);
            }
        }
        int k = sc.nextInt();
        head = reverseK(head, k);
        print(head);
        sc.close();
    }
}