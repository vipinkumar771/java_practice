import java.sql.SQLOutput;
import java.util.ArrayList;
public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> al1 =  new ArrayList<String>();
        al1.add("AAA");
        al1.add("BBB");
        al1.add("CCC");
        al1.add("DDD");
        System.out.println(al1);
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("CCC");
        al2.add("DDD");
        System.out.println(al2);
        System.out.println(al1.removeAll(al2));
        System.out.println(al1);
    }
}
