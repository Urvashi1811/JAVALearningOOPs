package OOPs.Interface;

public class Ex1 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.Area(2,5);
        rectangle r1 = new rectangle();
        r1.Area(6,78);
    }
}

interface Polygon{
    void Area(int length, int width);
}
 class square implements Polygon {
     @Override
     public void Area(int length, int width) {
         System.out.println("Area of Square" + " "+ 3.14* length* width);
     }
 }
 class rectangle implements Polygon {

     @Override
     public void Area(int length, int width) {
         System.out.println("Area of Rectangle" +" " + (length* width));
     }
 }