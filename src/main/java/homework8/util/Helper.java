package homework8.util;

import homework8.exception.UserExpectedError;
import homework8.exception.WrongFieldException;
import homework8.exception.WrongSumException;

public class Helper {
    private final int LENGTH_ID = 10;
    private final double AMOUNT_CHECK = 1000.0;

    public void checkID(String id) throws WrongFieldException {
        if (id == null || id.length() != LENGTH_ID) {
            throw new WrongFieldException();
        }
    }

    public void checkAmount(double amount) throws WrongSumException {
        if (amount > AMOUNT_CHECK) {
            throw new WrongSumException();
        }
    }

    public void checkAccountsId(String senderId, String inputId) throws UserExpectedError {
        if (senderId == null || inputId == null ||
                !senderId.equalsIgnoreCase(inputId)) {
            throw new UserExpectedError();

        }
    }
}
