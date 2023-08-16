@java.lang.FunctionalInterface
interface Persistable{
    public void persist();
}
class Employe implements Persistable{
    @Override
    public void persist(){
        System.out.println("Object persisted permanently");
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {
        Persistable p = new Employe();
        p.persist();
        System.out.println("Hello World");
    }
}
