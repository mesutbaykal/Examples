package atmProject.atm;

import atmProject.main.Account;
import atmProject.main.Data;

public final class ChaseBranch extends AbstractChase implements Register{

    public ChaseBranch(){
        super(5000);
    }

    @Override
    public boolean createAccount(String name, int pin, double deposit) {

        Data.allAccounts.add(new Account(name,Data.currentAvailableNum++,deposit, pin));
        return true;
    }
}
