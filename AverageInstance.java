package OOPS;

public class AverageInstance {
    float a=11, b=15, c=19;
    float avg;
    public static void main(String[] args) {
        AverageInstance obj = new AverageInstance();
        obj.avg = (obj.a+obj.b+obj.c)/3;
        System.out.println("Average = "+obj.avg);
        
    }
}
