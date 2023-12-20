package MKBankInc;

public class Checking extends Account{

    private int debitCardNum;
    private int debitCardPIN;

    public Checking(String st, String mKn, double initDeposit){
        super(st, mKn, initDeposit);
        accNumber = "2"+accNumber;
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate =getBaseRate() * 0.15;
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
                        " \n Debit Card PIN: "+ debitCardPIN+
                        " \n Interest Rate: "+rate+"%"
        );
    }
}
