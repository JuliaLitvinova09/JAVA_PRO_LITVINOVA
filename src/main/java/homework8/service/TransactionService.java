package homework8.service;

import homework8.entity.Client;
import homework8.exception.UserExpectedError;
import homework8.util.Helper;


public class TransactionService {
    public TransactionService() {
    }

    public void transferOfMoney(Client client, String id) throws UserExpectedError {
        Helper helper = new Helper();
        helper.checkAccountsId(client.getId(), id);
    }
}
