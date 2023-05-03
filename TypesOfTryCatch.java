import java.util.Scanner;

public class TypesOfTryCatch {
    public static void main(String[] args) {
        int choice =1;
        Scanner sc = new Scanner(System.in);
        
        while (choice==1) { 
        System.out.print("Enter the operation: ");
        int op = sc.nextInt();
        switch (op) {
            //Arithmetic Exception 
            case 1: 
                int a = 50;
                int b = 0;
                try {
                    int c = a/b;
                    System.out.println("Result= "+c);
                } 
                catch (Exception e) {
                    System.out.println("Failed to divide. Reason: ");
                    System.out.println(e);
                }
                System.out.println("End of the program");
                break;

            //Array Index Out Of Bounds Exception
            case 2:
                int marks [] = new int [3];
                marks[0] = 6;
                marks[1] = 9;
                marks[2] = 7;
                System.out.print("Enter the array index: ");
                int index = sc.nextInt();
        
                System.out.print("Enter the number which you want to divide the value with: ");
                int num = sc.nextInt();
        
                try{
                    System.out.println("Array index entered is: " + marks[index]);
                    System.out.println("Value of array-value/number is: " + marks[index]/num);
                }
                catch(ArithmeticException e){
                    System.out.println("ArithmeticException occured. ");
                    System.out.println(e);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException occured. ");
                    System.out.println(e);
                }
                catch(Exception e){
                    System.out.println("Some exception occured. ");
                    System.out.println(e);
                }
                break;  

            //Null Pointer Exception
            case 3:
                String name = null;
                try {
                    if(name.equals("Jalaj")){
                        System.out.println("Jalaj = Jalaj");
                    }
                } catch (NullPointerException e) {
                    System.out.println("Exception Caught");
                    System.out.println(e);
                }
                break;

            default:
                System.out.println("Exiting...");
                choice = 0;
                break;
        }
    }
    }
}
