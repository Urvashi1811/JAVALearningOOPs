package OOPs.Abstraction;

public class AbsEx1 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.loan50k();
        c1.loan25k();
        //Father f1 = new Father()
        Father f1 = new Child();
        }
    }

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("25k loan given");
    }
}

class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("paying 50k loan");
    }
}
