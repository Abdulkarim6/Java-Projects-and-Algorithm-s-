public class BankAccountS36 {
    //instance variable
    double balance;
    double balanceCityBank;

    // কনস্ট্রাক্টর
    public BankAccountS36() {
        balanceCityBank = 80000.0;
    }
    // কনস্ট্রাক্টর
    // public BankAccountS36(double balance) {
    //     this.balance = balance; [instance and initial same name thats why used this.]
    // }
    // কনস্ট্রাক্টর
    public BankAccountS36(double initialValue) {
        balance = initialValue;
    }

    // method
    void deposit(double depositB){
        balance = balance + depositB;
        System.out.println("deposited: " + depositB);
    }
    // method
    void withdraw(double withdrawB){
        if(balance > 0 && balance >= withdrawB){
            balance = balance - withdrawB;
            System.out.println("Your withdraw balance: " + withdrawB);
        }
    }
    // method
    public double getBalance() {
        return balance;
    }
    // method
    public double getBalanceCityBank() {
        return balanceCityBank;
    }

    public static void main(String[] args) {
        BankAccountS36 account1 = new BankAccountS36();
        BankAccountS36 account = new BankAccountS36(0.0);
           // account.balance = 500;
            account.deposit(1000);
            account.withdraw(300);
            System.out.println("Your remaining balance: " + account.getBalance());
            System.out.println("Your remaining balance in CityBank: " + account1.getBalanceCityBank());
        }
    
    
}
