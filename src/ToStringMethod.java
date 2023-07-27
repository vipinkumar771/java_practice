class E {

}
public class ToStringMethod {
    public static void main(String[] args) {
        E a = new E();
        String ref = a.toString();
        System.out.println(ref);
        System.out.println(a.toString());


        System.out.println(a);
    }
}
