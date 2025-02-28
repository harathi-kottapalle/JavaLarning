package feb_16th_task;

public class Book_program {

    //Book class which has an abstract method getDetails(),name, author, price.
    //PrintMyBook class that inherits from the Book class. abstract
    //Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");

    public static void main(String[] args) {
        Book myBook = new PrintMyBook("Harry potter", "J.K Rowling", 120);

        myBook.getDetails();

    }
}
class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);

    }
    @Override
    void getDetails(){
        System.out.println(name + ", " + author + ", " + price);
    }


}
abstract class Book{
    String name;
    String author;
    int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    abstract  void getDetails();

    @Override
    public String toString(){
        return "Book Name: " + name + "\nAuthor: " + author + "\nPrice: " + price;
    }

}
