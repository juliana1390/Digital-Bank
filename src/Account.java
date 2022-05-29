public abstract class Account implements iAccount{

    private static final int STD_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double cashAtBank;


    public Account() {
        this.branch = Account.STD_BRANCH;
        this.number = SEQUENTIAL++
    }

    @Override
    public void ToWithdrawTheMoney(double value){

    }

    @Override
    public void toMakeADeposit(double value){

    }

    @Override
    public void ToWireTheMoney(double value, Account destinationAccount){

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

}
