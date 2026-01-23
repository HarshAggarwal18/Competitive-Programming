public class TheNewYear {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int abs1 = Math.abs(x1 - x2);
        int abs2 = Math.abs(x2 - x3);
        int abs3 = Math.abs(x1 - x3);
        int res = Math.max(abs1, Math.max(abs2, abs3));
        System.out.println(res);

        // change made
    }
}
