package OOPS;

public class AreaRectangeInstance {
    int length = 5;
    int width = 12;
    int area;
    public static void main(String[] args) {
        AreaRectangeInstance obj = new AreaRectangeInstance();
        obj.area = obj.length * obj.width;
        System.out.println(obj.area);
        
    }
}
