public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount(String firstName,String lastName, int accountID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.0;
    }
    
    public void deposit(double amount){
        if (amount>0) {
                balance += amount;
                System.out.println("Depostited: " + amount);
            }else{
                System.out.println("Deposit amount must be positive");
            } 
    }

    public void withdrawal(double amount){
        if (amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }else if(amount>balance){
            System.out.println("Not enough funds");
        }else{
            System.out.println("Withdrawal amount has to be postive");
        }
        }

    public String getFirstName(){
            return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAccount(){
        return accountID;
    }
    
    public double getBalance(){
        return balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAccount(int accountID){
        this.accountID = accountID;
    }

    public void accountSummary(){
        System.out.println("Account ID: " + accountID);
        System.out.println("Account holder: " + firstName + " " + lastName);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("TED", "Mosbey", 1234567);
        account.accountSummary();

        account.deposit(20);
        account.withdrawal(10);

        account.accountSummary();
    }
}


