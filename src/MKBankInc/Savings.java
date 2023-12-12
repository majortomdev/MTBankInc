package MKBankInc;

public class Savings extends Account{

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String sSn, double initDeposit){
        super(name, sSn, initDeposit);
        accNumber = "1"+accNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() -.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Savings Account Features:  "+
                " \n Safety Deposit Box ID: "+ safetyDepositBoxID+
                " \n Safety Deposit Box Key: "+ safetyDepositBoxKey+
                " \n Interest Rate: "+rate+"%"
        );
    }
}
