package super_Abstraction;

public class lab_01 {
    public static void main(String[] args) {

    }
}
//sigle inheritence
class car extends vehicle{
    private int maxspeed =280;
    car(){
        super(100);
    }
    car(int a){
        System.out.println("PC constructor");
    }

    @Override
    void display() {
        System.out.println(" override car");
        System.out.println(super.maxspeed);// super keyword is used to call functions from the parent class
        System.out.println(this.maxspeed); //this keyword is used to call functions within the own class
    }
}

// parent class
class vehicle{
    public int maxspeed =100;

    vehicle() {

        System.out.println("Default constructor");
    }

    vehicle(int a){
        System.out.println("param constructor");
    }
//Method overloading
    void message(){
        System.out.println(" No argument, no return type");
    }
    void message(int a){
        System.out.println("Parametarized constructor -arguements");
    }
    void display(){
        System.out.println("vehicle parent");
    }
}
