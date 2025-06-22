package OOPs.Static;

public class ex1 {
    public static void main(String[] args) {
        Ab a1 = new Ab();
        Ab b1 = new Ab();
        System.out.println();
    }
}

class Ab{
    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    Ab(){

    }
}
