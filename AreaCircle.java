import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius = ");
        double rad = sc.nextDouble();
        double area = 3.14 * rad * rad;
        System.out.println("Area = "+area);

    }
}
