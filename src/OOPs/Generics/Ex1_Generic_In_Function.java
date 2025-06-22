package OOPs.Generics;

public class Ex1_Generic_In_Function {
    public static void main(String[] args) {
        temp_value(3,5);
        temp_value(23.43, 45.91);
        temp_value("urvashi", "mahavar");
    }
static <T> T temp_value(T a, T b){
    System.out.println(a);
    System.out.println(b);
    return null;
}

}

