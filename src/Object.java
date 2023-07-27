public class Object {
    int i = 10;
    int j = 20;
}
class D {
    public static void main(String[] args) {
        Object a = new Object();
        for(
                int i = 1;
                i<=10;i++)

        {
            a.i = a.i + 1;
            a.j = a.j + 1;
        }
        System.out.println(a.i);
        System.out.println(a.j);
    }
}