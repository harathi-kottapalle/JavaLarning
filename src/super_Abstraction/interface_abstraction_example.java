package super_Abstraction;

public class interface_abstraction_example {
    public static void main(String[] args) {
        Car1 car1=new Car1();
        car1.drive();
    }
}

class Car1 implements Engine1, breaks{

    void drive(){
        startEngine();
        System.out.println("apply break");
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("startEngine");

    }

    @Override
    public void breaks() {
        System.out.println("apply break");

    }
}
interface Engine1{
    void startEngine();
    void stopEngine();
}
interface breaks{
    void breaks();

        }
