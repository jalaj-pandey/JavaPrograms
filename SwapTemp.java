public class SwapTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int temp;

        System.out.println("after Swapping Numbers Are: " +a+","+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping Numbers Are: " +a+","+b);
    }
}
