package OOPs.Constructor;

public class Constructor_Param {
    public static void main(String[] args) {
        car c1 = new car();
            System.out.println(c1.name);
car c2 = new car("mahindra", "scorpio", 2020);
        System.out.println(c2.model);
    }
}
class car{
    String name;
    String model;
    int year;
    car(){
        name = "AAA";
        model = "xx";
        year = 1992;
    }

    car(String name, String model,int year){
        this.name = name;
        this.model = model;
        this.year = year;

    }
}
