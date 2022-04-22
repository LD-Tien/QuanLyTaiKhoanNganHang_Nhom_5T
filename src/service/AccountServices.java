package service;

import dao.Dao;
import java.sql.SQLException;
import model.Account;

public class AccountServices {
    
    public Account getAccountByMaThe309(String maThe309) throws SQLException {
        Dao dao309 = new Dao();
        return dao309.getAccountByMaThe309(maThe309);
    }
    
    public void UpdateAccount309(Account acc309) throws SQLException {
        Dao dao309 = new Dao();
        dao309.UpdateAccount309(acc309);
    }
    
}
