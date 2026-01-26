import java.util.Scanner;

public class InSearchOfEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            // System.out.println(n);
            int a = sc.nextInt();
            if(a == 1) {
                System.out.println("HARD");
                return;
            }
            n--;
        }
        System.out.println("EASY");
        sc.close();
// .. 
    }
}
