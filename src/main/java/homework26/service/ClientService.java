package homework26.service;

import homework26.dao.ClientDao;
import homework26.model.Client;

import java.util.List;

public class ClientService {
    private ClientDao clientDao= new ClientDao();

    public void save(Client client) {
        if (client == null) {
            System.out.println("client is null");
        }
        clientDao.save(client);
    }
    public void update(Client client) {
        if (client == null) {
            System.out.println("client is null");
        }
        clientDao.update(client);
    }
    public void delete(Client client) {
        if (client == null) {
            System.out.println("client is null");
        }
        clientDao.delete(client);
    }
    public Client getById(int id) {
        Client client = clientDao.getById(id);
        return client;
    }

    public List<Client> getAll() {
        return clientDao.getAll();
    }
    public Client getByPhone(Long phone) {
        Client client = clientDao.getByPhone(phone);
        return client;
    }
}

