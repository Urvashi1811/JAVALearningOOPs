package OOPs.Encapsulation;

public class Encap1 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);

        Goodvwologin vwologin = new Goodvwologin("admin", "pass123");

        vwologin.setUsername("urvashi");
        System.out.println(vwologin.getUsername());

    }
}
class VWOLogin{

    public String Username;
    public String password;

    VWOLogin(String Username_ar, String Password_ar){
        this.Username = Username_ar;
        this.password = Password_ar;

    }
}

class Goodvwologin{

    private String Username;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin){
            this.Password = password;}
        else {
            System.out.println("Not Allowed");
        }
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    private String Password;

    public  Goodvwologin(String username, String password){
        this.Username = username;
        this.Password = password;

    }
}