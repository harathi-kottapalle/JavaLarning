package OOPs_Concepts;

public class Cat {
    public static void main(String[] args) {
        Cats c1=new Cats();
        c1.running();

    }
}
class Cats{
    String name;


    void running(){
        System.out.println("Running");
    }
}
