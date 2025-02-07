package if_else_programs;

import java.util.Scanner;

public class if_else04 {
    public static void main(String[] args) {
        // Determine the Type of Website Based on Domain (.com, .org, .edu, etc.) 
        //
        //           :- take the Site URL input from the user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website URL");
        String website =sc.nextLine();
        sc.close();
        
        if (website.endsWith(".com")){
            System.out.println("This is a commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
            
        } else if (website.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
            
        } else if (website.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
            
        } else if (website.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
            
        } else if (website.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
            
        }else {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
