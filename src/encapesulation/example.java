package encapesulation;

public class example {
    public static void main(String[] args) {

        ICICIBank harathi =new ICICIBank( "Harathi", 500);
        System.out.println(harathi.getBal());

        boolean isCashier = true;
        harathi.setBal(1000, isCashier);
        System.out.println(harathi.getBal());
    }
}

class ICICIBank{

    private  String name;
    private long bal;
    public String bank_name="ICICIBank";

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier){
        this.bal = bal;
        }
        else {
            System.out.println("not allowed to get balance");

        }
    }
}
