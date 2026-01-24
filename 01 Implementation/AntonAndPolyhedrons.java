import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // String[] a = new String[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            String s = scanner.next();
            if(s.equals("Tetrahedron")){
                sum += 4;
            }else if(s.equals("Cube")){
                sum += 6;
            }else if(s.equals("Octahedron")){
                sum += 8;
            }else if(s.equals("Dodecahedron")){
                sum += 12;
            }else if(s.equals("Icosahedron")){
                sum += 20;
            }
        }
        scanner.close();
        System.out.println(sum);
    }
    
}
