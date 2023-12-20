package MKBankInc;

import java.util.ArrayList;
import java.util.List;
import utilities.*;

public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<Account>();



        String file = "C:\\dev\\MKBankInc\\liveAccounts.txt";

        List<String[]> newAccountUser = utilities.CSV.read(file);

        for(String[] accUser: newAccountUser){
            String name = accUser[0];
            String mKN = accUser[1];
            String accType = accUser[2];
            Double startingDeposit = Double.parseDouble(accUser[3]);
            if (accType.trim().equals("Savings")){
                accounts.add(new Savings(name,mKN,startingDeposit));
            }else if (accType.trim().equals("Checking")) {
                accounts.add(new Checking(name,mKN,startingDeposit));
            }else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        //accounts.get(7).showInfo();
        for (Account acc: accounts){
            System.out.println("************************");
            acc.showInfo();
        }

    }
}
