public class SwapInstance {
    int a = 4;
    int b = 5;
    public static void main(String[] args) {
        SwapInstance obj = new SwapInstance();
        System.out.println("Before Swapping Numbers Are: " +obj.a+","+obj.b);
        obj.a = obj.a + obj.b;
        obj.b = obj.a - obj.b;
        obj.a = obj.a - obj.b;
        System.out.println("Before Swapping Numbers Are: " +obj.a+","+obj.b);

    }

}
