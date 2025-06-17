package OOPs.Constructor;

public class JAVAConstructor1 {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }
}
    class Baby {
        String Name;

        void cry() {
            System.out.println("cry");
        }

        void eat() {
            System.out.println("eat");
        }

        void sleep() {
            System.out.println("sleep");
        }
        Baby(){
            System.out.println("I am Default constructor");
        }
    }


