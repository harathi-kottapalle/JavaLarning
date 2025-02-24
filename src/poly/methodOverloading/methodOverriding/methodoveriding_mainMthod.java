package poly.methodOverloading.methodOverriding;

public class methodoveriding_mainMthod {
    public static void main(String[] args) {
        father f1=new father();
        f1.home();


        son s1=new son();
        s1.home();
        father f2 =new son();
        f2.home();    //method overriding//
    }
}
