package MKBankInc;

public class Checking extends Account{

    int debitCardNum;
    int debitCardPIN;

    public Checking(String st, String sSn, double initDeposit){
        super(st, sSn, initDeposit);
        accNumber = "2"+accNumber;
        setDebitCard();
    }

    private void setDebitCard(){
        debitCardNum = (int)(Math.random() * Math.pow(10,12));
        debitCardPIN = (int)(Math.random() * Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Checking Account Features:  "+
                        " \n Debit Card Number: "+ debitCardNum+
                        " \n Debit Card PIN: "+ debitCardPIN
        );
    }
}
