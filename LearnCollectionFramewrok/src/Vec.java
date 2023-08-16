import java.util.Vector;

public class Vec {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(10,5);
        System.out.println(v.capacity());
        for(int i = 1; i <= 11; i++){
            v.add(i);
        }
        System.out.println(v.capacity());
        for(int i = 12; i <= 16; i++) {
            v.add(i);
        }
        System.out.println(v.capacity());
        for(int i = 17; i<=21; i++){
            v.add(i);
        }
        System.out.println(v.capacity());
    }
}
