public abstract class Account implements iAccount{

    private static final int STD_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double cashAtBank;


    public Account() {
        this.branch = Account.STD_BRANCH;
        this.number = SEQUENTIAL++;
    }

    @Override
    public void toWithdrawTheMoney(double value){
        cashAtBank -= value;
    }

    @Override
    public void toMakeADeposit(double value){
        cashAtBank += value;
    }

    @Override
    public void toWireTheMoney(double value, Account destinationAccount){
        this.toWithdrawTheMoney(value);
        destinationAccount.toMakeADeposit(value);
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getCashAtBank() {
        return cashAtBank;
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Branch: %d", branch));
        System.out.println(String.format("Number: %d", number));
        System.out.println(String.format("Cash At Bank: %.2f", cashAtBank));
    }

}
