import java.util.Scanner;

public class SoftOfDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of friends
        int k = sc.nextInt();   // number of bottles
        int l = sc.nextInt();   // ml per bottle
        int c = sc.nextInt();   // number of limes
        int d = sc.nextInt();   // slices per lime
        int p = sc.nextInt();   // grams of salt
        int nl = sc.nextInt();  // ml needed per friend
        int np = sc.nextInt();  // salt needed per friend

        int totalDrink = k * l;          // total drink in ml
        int totalSlices = c * d;         // total lime slices

        int byDrink = totalDrink / nl;   // friends served by drink
        int byLime = totalSlices;        // friends served by lime
        int bySalt = p / np;             // friends served by salt

        int result = Math.min(Math.min(byDrink, byLime), bySalt) / n;
        System.out.println(result);

        sc.close();
    }
}
