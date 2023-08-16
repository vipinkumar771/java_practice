import java.util.Comparator;
import java.util.TreeSet;
public class Tree {
    public static void main(String[] args) {
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        };
        TreeSet<String> ts = new TreeSet<String>(c);
        ts.add("FFF");
        ts.add("AAA");
        ts.add("EEE");
        ts.add("BBB");
        ts.add("DDD");
        ts.add("CCC");
        System.out.println(ts);
    }
}
