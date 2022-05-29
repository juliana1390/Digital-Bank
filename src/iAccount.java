public interface iAccount {

    class ToWithdrawTheMoney(double value);

    class toMakeADeposit(double value);

    class ToWireTheMoney(double value, Account destinationAccount);
}
