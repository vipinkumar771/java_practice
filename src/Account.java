public class Account {
    String accNo;
    String accHolderName;
    String accType;
    int balance;
    public void setAccountDetails(String acc_No, String acc_Holder_Name, String acc_Type, int acc_Balance){
        accNo = acc_No;
        accHolderName = acc_Holder_Name;
        accType = acc_Type;
    }
    public void getAccountDetails(){
        System.out.println("Account Details");
        System.out.println("----------------");
        System.out.println("Account Number :" + accNo);
        System.out.println("Account Holder Name :" + accHolderName);
        System.out.println("AccountType :" + accType);
        System.out.println("Account Balance :" + balance);
    }
}
class TestHere{
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountDetails("abc123", "Durga", "saving", 25000);
        acc.getAccountDetails();
    }
}
