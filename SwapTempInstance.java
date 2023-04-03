public class SwapTempInstance {
    int a = 5;
    int b = 9;
    int temp;

    public static void main(String[] args) {
        SwapTempInstance obj = new SwapTempInstance();
        System.out.println("Before Swapping Numbers Are: " +obj.a+","+obj.b);
        
        obj.temp = obj.a;
        obj.a = obj.b;
        obj.b = obj.temp;

        System.out.println("After Swapping Numbers Are: " +obj.a+","+obj.b);
    }
}
