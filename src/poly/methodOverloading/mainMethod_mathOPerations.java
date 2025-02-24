package poly.methodOverloading;

public class mainMethod_mathOPerations {
    public static void main(String[] args) {
        mathOperation m1=new mathOperation();
        int r= m1.add(3,5);
        System.out.println(r);


        int t=m1.add(3,5,5);
        System.out.println(t);

    }
}
