package OOPs.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Maths m1 = new Maths();
        int ms = m1.add(2,3);
        int m2 = m1.add(3,4,5);
        double m3 = m1.add(21.4, 34.1);
    }

    }


class Maths{
    int add( int a, int b){
        return a + b;
    }
  int add( int a, int b, int c){
        return a+b+c;
  }
  double add( double a, double b){
        return a+b;
  }

}
