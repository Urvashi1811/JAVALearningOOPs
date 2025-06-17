package OOPs.Interface;

public class ex2 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.drive();
    }
}

interface Engine{
    void startEngine();
    void stopEngine();

    default void test(){
        System.out.println("concrete");
    }
}

class Car1 implements Engine {
    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Car starts");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stops");
    }


}
