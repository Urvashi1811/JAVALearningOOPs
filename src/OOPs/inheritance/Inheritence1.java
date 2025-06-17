package OOPs.inheritance;

public class Inheritence1 {
    public static void main(String[] args) {
        Father F1 = new Father();
        System.out.println(F1.gold_f);
        F1.bhk1();

        Son S1 = new Son();
        System.out.println(S1.gold_s);
        S1.bhk2();
        System.out.println(S1.gold_f);
        S1.bhk1();
    }
}

class Father{
    int gold_f = 1000;
     void bhk1(){
        System.out.println("1bhk of father");
    }
}
class Son extends Father{
    int gold_s = 2000;
    void bhk2(){
        System.out.println("2bhk of son");
    }
}