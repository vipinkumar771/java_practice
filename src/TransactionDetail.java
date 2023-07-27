class Transaction {
    String txId;
    String accNo;
    String accHolderName;
    String accType;
    String txtType;
    int initial_Balance;
    int totalBalance;
    int wdAmt;
    int intialBalance;
    String txStatus;


    public Transaction(String tx_id, String acc_No, String acc_Holder_Name, String acc_Type, int initial_Balance){
        txId = tx_id;
        accNo= acc_No;
        accHolderName = acc_Holder_Name;
        accType = acc_Type;
        intialBalance = initial_Balance;
    }
    public  void withdraw(int wd_Amt){
        totalBalance = initial_Balance - wd_Amt;
        String  txtType = "Withdraw";
        int  wdAmt = wd_Amt;
        String txStatus ="Success";
    }

    public String toString(){
        System.out.println("Transaction Details");
        System.out.println("-----------------------");
        System.out.println("Transaction Id : " +txId);
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Holder Name : "+ accHolderName);
        System.out.println("Account Type :" + accType);
        System.out.println("Tranaction Type :" + txtType);
        System.out.println("Initial Balance :" + initial_Balance);
        System.out.println("Withdraw Amount :" + wdAmt);
        System.out.println("Total balance :" + totalBalance);
        System.out.println("Total transaction :" + txStatus);
        return "";
    }
}
public class TransactionDetail {
    public static void main(String[] args) {
        Transaction tx = new Transaction("T11", "account", "Vipin", "saving", 5000);
        tx.withdraw(10000);
        System.out.println(tx);
    }
}
