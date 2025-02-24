package OOPs_Constructors;

import javax.swing.*;

public class car2 {
    String name;
    String model;
    int year;

    //Default constructor
    car2(){

        name="tech mahendra";
        model="unknown";
        year=2015;
        System.out.println("DC");
    }
    // Param - Constructor
       car2(String model_name,int year_created){
           this.model = model_name;
           this.year = year_created;
        }
}
