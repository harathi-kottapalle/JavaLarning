package super_Abstraction;

public class abstract_class_example {
    public static void main(String[] args) {
        child c =new child(); // shows only essential details in method
        c.loanof50k();
        c.loan20k();         //
    }
}
//Abstract class                         // hide the unneccesary classes or details
abstract class father{
    abstract void loanof50k();// incomeplete loan
    void loan20k(){
        System.out.println("paid 20k loan amout");
    } /// complete loan
        }
        class child extends father{

            @Override
            void loanof50k() {
                System.out.println("child should be pay father loan 50k");
            }
        }
