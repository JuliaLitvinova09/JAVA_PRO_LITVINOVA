package homework24.service;

import homework24.DataBase;
import homework24.entity.Account;
import homework24.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private String QUERY_SAVE = "INSERT INTO accounts (client_id,number,value) VALUES (?,?,?)";
    private String QUERY_UPDATE = "UPDATE accounts SET value=? WHERE client_id=?";
    private String QUERY_DELETE = "DELETE FROM accounts WHERE client_id=?";
    private String QUERY_GET_ALL = "SELECT * FROM accounts";
    private String QUERY_GET_NUMBER = "SELECT number FROM accounts WHERE value>?";

    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClient_id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void delete(Account account) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);

            preparedStatement.setDouble(1, account.getValue());
            preparedStatement.setInt(2, account.getClient_id());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Account account) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getListNumberByValue(double value) {
        List<String> accounts = new ArrayList<>();

        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_NUMBER)) {
            connection.setAutoCommit(false);
            preparedStatement.setDouble(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            connection.commit();
            while (resultSet.next()) {
                accounts.add(resultSet.getString("number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
}





