package homework25.service;

import homework25.dao.AccountDao;
import homework25.model.Account;

import java.util.List;

public class AccountService {
    private AccountDao accountDao = new AccountDao();

    public void save(Account account) {
        if (account == null) {
            System.out.println("account is null");
        }
        accountDao.save(account);
    }

    public void update(Account account) {
        if (account == null) {
            System.out.println("account is null");
        }
        accountDao.update(account);
    }

    public void delete(Account account) {
        if (account == null) {
            System.out.println("account is null");
        }
        accountDao.delete(account);
    }

    public Account getById(int id) {
        Account account = accountDao.getById(id);
        return account;
    }

    public List<Account> getAll() {
        return accountDao.getAll();
    }

}
