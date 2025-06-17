package OOPs.inheritance.Multilevel;

public class Multilevel {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.f();
        s1.gf();
        s1.S();

        System.out.println("-----");
        Father f1 = new Father();
        f1.gf();
        f1.f();
        System.out.println("-----");

        GrandFather gf1 = new GrandFather();
        gf1.gf();
    }
}
