package atmProject.main;

import atmProject.atm.ATM;
import atmProject.atm.ChaseBranch;
import atmProject.atm.ChaseExternal;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ATM atm = null;

        if(Data.get("branch").equals("chase external")) {
            atm = new ChaseExternal();
        } else if(Data.get("branch").equals("chase branch")){
            atm = new ChaseBranch();
        }

        System.out.println("Enter your username and pin");

        atm.login(input.next(),input.nextInt());
//        atm.login("annabananna", 3341);

        while(Data.currentAccount != null){
            atm.interfaceMenu(input);
        }

        atm.turnOff();

    }
}


/*
#Scenario 1
create a main method
create a Scanner object
create an object of the branch needed based on the defined 'branch' property
use the ATM reference
call the interfaceMenu method
#Scenario 2
comment out last step of Scenario 1
call turnOn method
verify accounts are loaded by printing all the accounts
#Scenario 3
call the interfaceMenu method
call login method
ask for user name and pin from the console.
give valid credentials: andrew_java, 9183
call the interfaceMenu method
#Scenarios 4, 5, 6, 7, 8: repeat the interfaceMenu to go through all the main
functions: check balance, deposit, withdraw, transfer, logout
#Scenario 9: call turnOff method and check the currentAccount & allAccounts
variables
 */
