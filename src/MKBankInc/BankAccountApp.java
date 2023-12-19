package MKBankInc;

import java.util.List;
import utilities.*;

public class BankAccountApp {
    public static void main(String[] args) {
//        Checking chkacc1 = new Checking("Barney Rubble","234367548",2400);
//
//        Savings savacc1 = new Savings("Sandy Shaw","834312595",3700);
//        savacc1.compound();
//        chkacc1.showInfo();
//        System.out.println("***********************");
        String file = "C:\\dev\\MKBankInc\\liveAccounts.txt";

        List<String[]> newAccountUser = utilities.CSV.read(file);

        for(String[] accUser: newAccountUser){
            System.out.println("NEW ACCOUNT:  ");
            //System.out.println( );
            System.out.println("Name: "+accUser[0]);
            System.out.println("Acc No: "+accUser[1]);
            System.out.println("Type: "+accUser[2]);
            System.out.println("Balance: "+accUser[3]);
            System.out.println("_______________");
        }


    }
}
