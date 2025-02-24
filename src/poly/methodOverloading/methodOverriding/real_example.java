package poly.methodOverloading.methodOverriding;

public class real_example {
    public static void main(String[] args) {
       // TC t1=new TC();
       // t1.openBrower();

        TC2 t2=new TC2();
        t2.openBrower();

    }


}
class CommonToAllTc{
    void openBrower(){
        System.out.println("open browser in 5 seconds");
    }
}
class TC extends CommonToAllTc{
    void startTc(){
        System.out.println("start Browser");
    }
}
class TC2 extends CommonToAllTc{
    @Override
    void openBrower(){
        System.out.println("open Browserin 2 seconds");
    }
}
