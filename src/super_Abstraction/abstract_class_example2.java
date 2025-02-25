package super_Abstraction;

public class abstract_class_example2 {
    public static void main(String[] args) {
        wagnor wagnor= new wagnor();
        wagnor.drive();
    }
}
class wagnor extends engine{

    @Override
    void startEngine() {
        System.out.println("start");
    }

    @Override
    void stopEngine() {

        System.out.println("stop");

    }
    void drive(){
        startEngine();
        System.out.println("driving the car");
        stopEngine();
    }
}


abstract class engine{
    abstract void startEngine();
    abstract void stopEngine();


}
