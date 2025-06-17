package OOPs.Constructor;

public class Constructor_PC {
    public static void main(String[] args) {
         Person p1 = new Person("urvashi","abc", 1203213);
        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.phone);

         }
    }

class Person{
    String name;
    String address;
    long phone;

    Person(){

    }

    Person(String name_ar, String address_ar, long phone_ar){
        this.name = name_ar;
        this.address = address_ar;
        this.phone = phone_ar;
    }
}
