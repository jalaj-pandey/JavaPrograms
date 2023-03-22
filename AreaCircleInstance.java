package OOPS;

import java.util.Scanner;

public class AreaCircleInstance {
    Scanner sc = new Scanner(System.in);
    double rad = sc.nextDouble();
    double area;
    public static void main(String[] args) {
        System.out.print("Radius = ");
        AreaCircleInstance obj = new AreaCircleInstance();
        obj.area = 3.14 * obj.rad * obj.rad;
        System.out.println("Area " + obj.area);
    }
}
