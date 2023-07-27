public class NewFile {
    public static void main(String[] args) {
        String str = new String ("Durga Software solution");
        System.out.println(str);
        Exception ex = new Exception( "My own Exception");
        System.out.println(ex);
        Thread t = new Thread("Core Java");
        System.out.println(t);
        Integer in = new Integer(100);
        System.out.println(in);

        java.util.ArrayList al = new java.util.ArrayList();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        System.out.println(al);
    }
}
