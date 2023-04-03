public class OddEvenInstance {
    int num = 52;

public static void main(String[] args) {
    OddEvenInstance obj = new OddEvenInstance();
    if (obj.num%2==0) {
        System.out.println(obj.num + " is even");
    }
    else{
        System.out.println(obj.num + " is odd");
    }
}
}