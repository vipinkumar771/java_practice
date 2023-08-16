import java.util.*;

import java.util.ArrayList;
class Bank{
    public void listCustomerName(){
        @SuppressWarnings("unchecked")
        ArrayList<String> al = new ArrayList<String>();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        System.out.println(al);
    }
}


public class SuppressWarning {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.listCustomerName();
    }
}
