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
            String name = accUser[0];
            String mKN = accUser[1];
            String accType = accUser[2];
            Double startingDeposit = Double.parseDouble(accUser[3]);
            System.out.print(name+", "+mKN+", "+accType+", £"+startingDeposit+"  ->  ");
            if (accType.trim().equals("Savings")){
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }else if (accType.trim().equals("Checking")) {
                System.out.println("OPEN A CHECKING ACCOUNT");
            }else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }


    }
}
