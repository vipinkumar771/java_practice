public class ConstructorTest {
    ConstructorTest(){
        System.out.println("A-Con");
    }
}
class T{
    public static void main(String[] args) {
        ConstructorTest a = new ConstructorTest();
    }
}
