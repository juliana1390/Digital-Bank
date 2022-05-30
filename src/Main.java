public class Main {
    public static void main(String[] args) {
        Account ca = new CheckingAccount();
        //ca.toMakeADeposit(100);

        Account sa = new SavingsAccount();
        //ca.toWireTheMoney(50, sa);

        ca.printBankStatement();
        sa.printBankStatement();
    }
}
