package MKBankInc;

public abstract class Account implements IBaseRate {

    String name;
    String sSn;
    double balance;
    static int index = 10000;
    String accNumber;
    double rate;


    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSn = sSn;
        balance = initDeposit;

        index++;
        this.accNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSn.substring(sSn.length()-2);
        int endTwoDigitsIndex = index%100;
        int randomNumber = (int) (Math.random() *Math.pow(10,4));
        if(endTwoDigitsIndex<10){
            return lastTwoOfSSN+"0"+endTwoDigitsIndex+randomNumber;
        }else{
            return lastTwoOfSSN+""+endTwoDigitsIndex+randomNumber;
        }
    }
    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $"+accruedInterest);
        printBalance();
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $"+amount);
        printBalance();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $"+amount);
        printBalance();
    }
    public void transfer(String whereTo, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $"+amount+" to "+whereTo);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now $"+balance);
    }


    public void showInfo() {
        System.out.println("Name: "+name+"\n SSN: "+sSn+"\n Acc No: "+accNumber+"\n Balance: "+balance);
    }
}
