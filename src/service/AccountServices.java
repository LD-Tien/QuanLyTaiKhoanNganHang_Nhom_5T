package service;

import dao.AccountDao;
import java.sql.SQLException;
import model.Account;

public class AccountServices {
    
    public Account getAccountByMaThe309(String maThe309) throws SQLException {
        AccountDao dao309 = new AccountDao();
        return dao309.getAccountByMaThe309(maThe309);
    }
    
    public boolean UpdateAccount309(Account acc309) throws SQLException {
        AccountDao dao309 = new AccountDao();
        return dao309.UpdateAccount309(acc309);
    }
    
}
