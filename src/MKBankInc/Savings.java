package MKBankInc;

public class Savings extends Account{

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String sSn, double initDeposit){
        super(name, sSn, initDeposit);
        accNumber = "1"+accNumber;
        setSafetyDepositBox();

    }

    private void setSafetyDepositBox() {
        
    }
}
