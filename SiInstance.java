package OOPS;

public class SiInstance {
    float p=30, t=2, r=5;
    float si;
    public static void main(String[] args) {
        SiInstance obj = new SiInstance();
        obj.si = (obj.p * obj.t * obj.r)/100;
        System.out.println("Simple Interest = "+ obj.si);
    }
}
