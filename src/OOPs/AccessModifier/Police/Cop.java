package OOPs.AccessModifier.Police;

public class Cop {
    protected int gun;
    String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }
    protected void canishoot(){
        System.out.println("yes u can");
    }
}
