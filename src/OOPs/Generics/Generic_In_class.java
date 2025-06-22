package OOPs.Generics;

public class Generic_In_class {
    public static void main(String[] args) {
        GenericClass<Integer> ref1 = new GenericClass(5);
        System.out.println(ref1.getData());
    }
}
class GenericClass<T>{
    private T data;
    //pc
    public GenericClass(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }


}
