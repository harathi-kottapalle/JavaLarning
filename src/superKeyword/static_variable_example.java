package superKeyword;

import jdk.dynalink.beans.StaticClass;

public class static_variable_example {
    public static void main(String[] args) {
        ATB harathi= new ATB(990853720, "harathi");
        ATB usha = new ATB(762488645, "usha");
        System.out.println(harathi.name);
        System.out.println(harathi.phone_np);
        System.out.println(usha.name);
        System.out.println(ATB.course_name);
        ATB.m1();

    }
}
class ATB{
    static String course_name="ATB";
    int phone_np;
    String name;

    public ATB(int phone_np, String name){
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.name + this.phone_np + course_name );
    }
    static void m1(){
        System.out.println("mark the attendence");
    }
}
