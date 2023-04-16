package P1;

class Bank{
    protected String name;

    private String password;

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

}

public class Modifiers extends Bank {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.name = "Ram";
        System.out.println(b1.name);

        b1.setPassword("abc");
        System.out.println(b1.getPassword());   
    }
}
