package MKBankInc;

public class BankAccountApp {
    public static void main(String[] args) {
        Checking chkacc1 = new Checking("Barney Rubble","234367548",2400);

        Savings savacc1 = new Savings("Sandy Shaw","834312595",3700);

        chkacc1.showInfo();
        System.out.println("***********************");
        savacc1.showInfo();
    }
}
