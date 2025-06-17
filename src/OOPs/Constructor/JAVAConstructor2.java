package OOPs.Constructor;

public class JAVAConstructor2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.Name);
        System.out.println(c1.Year);
        System.out.println(c1.model);
        }
    }

    class Car{
        String Name;
        int Year;
        String model;
        Car(){
            Name = "AAA";
            Year = 1992;
            model = "xx";
        }
    }

