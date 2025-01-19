public class CheckingAccount extends BankAccount{
    private double interestRate;
    private static final double Overdraft_fee = 30.00;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate){
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterstRate(double interestRate){
        this.interestRate=interestRate;
    }

    public void processWithdrawal(double amount){
        if (amount>0){
            double newBalance = getBalance()-amount;
            if (newBalance >= 0) {
                super.deposit((-amount));
                System.out.println("Withdrew: " + amount);
             }else{
                double overdraftAmount = amount + Overdraft_fee;
                if ( getBalance()>= -Overdraft_fee){
                    super.deposit(-amount);
                    super.deposit(-overdraftAmount);
                }else{
                    System.out.println("Not enough funds, including overdaft fee.");
                }
             }
        }else{
            System.out.println("Withdrawal amount must be positive");
        }
    }

    public void displayAccount(){
        System.out.println("Account ID: " + getAccount());
        System.out.println("Account Holder: " + getFirstName() + " " + getLastName());
        System.out.println("Current Balance: $" + getBalance());
        System.out.println("Interst Rate: " + interestRate + "%");
    }
    
}

