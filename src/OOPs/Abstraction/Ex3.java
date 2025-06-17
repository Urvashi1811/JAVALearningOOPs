package OOPs.Abstraction;

public class Ex3 {

}

abstract class Employes{
    String SName;
    String address;
    int number;

    Employes(){
        System.out.println("DC");
    }

    Employes(String name, String add, int No){
        this.SName = name;
        this.address = add;
        this.number= No;
    }
    abstract double computepay();
     void mailcheck(){
         System.out.println("Mailing a check to " + this.SName + " " + this.address);
     }
     class c1 extends Employes {
         @Override
         double computepay() {
             return 0;
         }
     }
}

