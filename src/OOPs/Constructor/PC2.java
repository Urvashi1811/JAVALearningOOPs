package OOPs.Constructor;

public class PC2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.age);
        System.out.println(p1.phone);
        System.out.println(p1.IsMale);

        Person1 p2 = new Person1("Urvashi", 30, "qaz");
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);

        Person1 p3 = new Person1("CO", 34, "dfsfs");
        System.out.println(p3.age);
        System.out.println(p3.name);
        System.out.println(p3.address);

    p1.eat();
    p3.eat();
    p2.eat();
    p1.sleep();
    p3.walk();
    p2.doHome();
    }
}
    class Person1 {
    String name;
    int age;
    String address;
        long phone;
        boolean IsMale;
// DC
    Person1(){
        name= "Default Const";
        age= 1;
        address="First";
        phone=3423424234l;
        IsMale=false;

    }
    //PC
    Person1(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address= address;

    }
// constructor overloading
        Person1(String name,long phone){
            this.name = name;
            this.phone= phone;
        }
    void eat(){
        System.out.println("is eating!");
    }
        void sleep(){
            System.out.println(this.name + " is sleeping");
        }

        void walk(){
            System.out.println(this.name + " is walking");
        }

        void doHome(){
            System.out.println(this.name + " I am doing Homework");
        }
    }
