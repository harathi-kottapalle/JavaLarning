package superKeyword;

public class example {
    public static void main(String[] args) {
        TestCase1 t1=new TestCase1("chrome");
        t1.openBrowser();
        System.out.println("Testcase1 is running");
        t1.closeBrowser();


    }

}
class baseClass{
    private String name;

    public baseClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
        }else {
            System.out.println("change browser not allowed, not a Admin");
        }

    }
    void openBrowser(){
        System.out.println("open Browser");
    }
    void openBrowser(String browserName){
        System.out.println("openBrowser:" + browserName);
    }
    void closeBrowser(){
        System.out.println("closeBrowser");
    }
}
class TestCase1 extends baseClass{

    public TestCase1(String browser) {
        super(browser);
    }

    @Override
    public void setName(String name, boolean isAdmin) {
        super.setName(name, isAdmin);
    }
}
