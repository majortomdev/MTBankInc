package MKBankInc;

public class Checking extends Account{

    int debitCardNum;
    int debitCardPIN;

    public Checking(String st, String sSn, double initDeposit){
        super(st, sSn, initDeposit);
        accNumber = "2"+accNumber;
    }
    public void showInfo(){
        System.out.println("SHOW INFO");
    }
}
