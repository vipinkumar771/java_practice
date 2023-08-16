import java.awt.*;
class DBDriver {
    public void getDriver(){
        System.out.println("Type-1 Driver");
    }
}

class NewDBDriver extends DBDriver{
    @Override
    public void getDriver(){
        System.out.println("Type-4 Driver");
    }
}
class Annotation{
    public static void main(String[] args){
       DBDriver driver = new NewDBDriver();
       driver.getDriver();
        }
}