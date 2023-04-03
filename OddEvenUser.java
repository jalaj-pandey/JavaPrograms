import java.util.Scanner;

public class OddEvenUser {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(); 

    public static void main(String[] args) {
        System.out.print("Enter the number= ");
        OddEvenUser obj = new OddEvenUser();

        if (obj.num%2==0) {
            System.out.println(obj.num + " is even");
        } else {
            System.out.println(obj.num + " is odd");
        }
        
    }
}
