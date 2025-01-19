public class TestBankAccount {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("Mosby", "Ted", 654321, 1.5);

        // Display initial account details
        checkingAccount.displayAccount();

        // Test deposit and withdrawal methods
        checkingAccount.deposit(500.00);
        checkingAccount.processWithdrawal(200.00);  // Successful withdrawal
        checkingAccount.processWithdrawal(350.00);  // Overdraft withdrawal

        // Display updated account details
        checkingAccount.displayAccount();
    }
}