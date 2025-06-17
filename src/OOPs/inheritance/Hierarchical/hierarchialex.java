package OOPs.inheritance.Hierarchical;

public class hierarchialex {
    public static void main(String[] args) {
        Father f2 = new Father();
        f2.f1();

        System.out.println("----");

        son s2 = new son();
        s2.s1();
        s2.f1();
        System.out.println("------");

        daughter d2 = new daughter();
        d2.d1();
        d2.f1();
    }
}
class Father{
    void f1(){
        System.out.println("Father");
    }
}
class son extends Father{
    void s1(){
        System.out.println("son");
    }
}
class daughter extends Father{
    void d1(){
        System.out.println("daughter");
    }
}
