 interface Transaction{
    private void preTransaction(){
        System.out.println("Open Account");
        System.out.println("Begin Transaction");
    }

    private void postTransaction(){
        System.out.println("Commit/RollBack Transaction");
        System.out.println("End Transaction");
        System.out.println("Close the account");
    }
    public default void deposit(){
        preTransaction();
        System.out.println("Do Deposit");
        postTransaction();
    }
     public default void withdraw(){
         preTransaction();
         System.out.println("Do Withdraw");
         postTransaction();
     }
     public default void transfer(){
        preTransaction();
        System.out.println("Do Transfer");
        postTransaction();
     }
 }
class TransactionImpl implements Transaction{

}
public class Interface {
    public static void main(String[] args) {
        Transaction tx = new TransactionImpl();
        tx.deposit();
        System.out.println();
        tx.transfer();
    }
}
