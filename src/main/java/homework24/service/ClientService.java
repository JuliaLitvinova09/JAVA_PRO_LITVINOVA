package homework24.service;

import homework24.DataBase;
import homework24.entity.Account;
import homework24.entity.Client;
import homework24.entity.ClientView;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private String QUERY_SAVE = "INSERT INTO Clients (name, phone, email, about,age) VALUES (?,?,?,?,?)";
    private String QUERY_UPDATE = "UPDATE Clients SET phone=?,about=? WHERE name=?";
    private String QUERY_DELETE = "DELETE FROM Clients WHERE name=?";
    private String QUERY_GET_ALL = "SELECT * FROM Clients";
    private String QUERY_FIND = "SELECT * FROM Clients WHERE phone=?";
    private String QUERY_GET_CLIENTS_BY_ID = "SELECT * FROM Clients WHERE id=?";
    private String QUERY_GET_CLIENTS_FULL="""
            SELECT cl.name,cl.email, cl.phone, s.alias
            FROM client_status AS cs
            LEFT JOIN statuses s on s.id=cs.status_id
            LEFT JOIN clients cl on cl.id=cs.client_id
            WHERE age>?
            """;


    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setAbout(resultSet.getString("about"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void delete(Client client) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Client client) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setLong(1, client.getPhone());
            preparedStatement.setString(2, client.getAbout());
            preparedStatement.setString(3, client.getName());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Client client) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setLong(2, client.getPhone());
            preparedStatement.setString(3, client.getEmail());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5, client.getAge());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Client findByPhone(Long phone) {
        Client client = new Client();
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_FIND)) {
            connection.setAutoCommit(false);
            preparedStatement.setLong(1, phone);
            ResultSet result = preparedStatement.executeQuery();
            connection.commit();
            while (result.next()) {
                client.setId(result.getInt("id"));
                client.setName(result.getString("name"));
                client.setEmail(result.getString("email"));
                client.setAbout(result.getString("about"));
                client.setPhone(result.getLong("phone"));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }
    public List<Client> getListByID(Account account) {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_CLIENTS_BY_ID)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClient_id());
            ResultSet resultSet = preparedStatement.executeQuery();
            connection.commit();
            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setAbout(resultSet.getString("about"));
                client.setPhone(resultSet.getLong("phone"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
    public List<ClientView> getFullListByAge(int age) {
        List<ClientView> clientViews = new ArrayList<>();

        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_CLIENTS_FULL)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, age);
            ResultSet resultSet = preparedStatement.executeQuery();
            connection.commit();
            while (resultSet.next()) {
                ClientView clientView = new ClientView();
                clientView.setName(resultSet.getString("name"));
                clientView.setAlias(resultSet.getString("alias"));
                clientView.setEmail(resultSet.getString("email"));
                clientViews.add(clientView);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientViews;
    }
}
        




