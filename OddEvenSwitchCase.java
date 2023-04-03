import java.util.Scanner;

public class OddEvenSwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter the number= ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num%2){
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is Odd");
        }
    }
}
