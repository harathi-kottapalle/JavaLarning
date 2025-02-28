package superKeyword;

public class all_staticsin_oneplace {
    A a =new A();

}

class A{
    static {
        System.out.println("this is static block");
    }
    static String name = "harathi"; //static variable

    static void hello(){
        System.out.println("this is static function ");
    }
}
