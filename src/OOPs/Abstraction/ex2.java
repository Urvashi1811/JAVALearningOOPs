package OOPs.Abstraction;

public class ex2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.drive();
    }

}

abstract class Engine{
    abstract void StartEngine();
    abstract void StopEngine();

    void normal(){
        System.out.println("normal function");
    }
}

class Vehicle extends Engine{

    @Override
    void StartEngine() {
        System.out.println("Starting the vehicle");
    }

    @Override
    void StopEngine() {
        System.out.println("stop the vehicle");
    }
    void drive(){
        StartEngine();
        StopEngine();
    }
}