public interface iAccount {

    void toWithdrawTheMoney(double value);

    void toMakeADeposit(double value);

    void toWireTheMoney(double value, Account destinationAccount);

    void printBankStatement();

}
