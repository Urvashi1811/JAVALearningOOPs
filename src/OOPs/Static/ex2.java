package OOPs.Static;

public class ex2 {
    public static void main(String[] args) {
        A obj1 = new A(10);
        obj1.displayvalue();
        System.out.println(A.b);
    }
}

class A{

    int a= 10;
    static int b = 20;
    {
        System.out.println("IIB");
    }
    A(int a){
        this.a= a;
    }
    void displayvalue(){
        System.out.println(this.a);
    }
}
