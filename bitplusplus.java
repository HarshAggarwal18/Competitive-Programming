import java.util.Scanner;

public class bitplusplus {
    public static void main(String[] args) {
        // System.out.println("Hello, Bit++!");    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] op = new String[n];
        for (int i = 0; i < n; i++) {
            op[i] = sc.next();
        }
        int i = 0;
        int x = 0;
        while(i < n) {
            if(op[i].equals("X++") || op[i].equals("++X")) {
                x++;
            } else {
                x--;
            }
            i++;
        }
        System.out.println(x);
        sc.close();
    }
}