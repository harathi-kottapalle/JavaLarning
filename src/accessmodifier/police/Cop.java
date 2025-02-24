package accessmodifier.police;

public class Cop {
    public int gun;
    String iCard;

    public  Cop(int gun) {
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println(" yes you can shoot!");
    }
}


