package homework25.dao;

import homework25.model.Client;
import homework25.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;


public class ClientDao {
    public void save(Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(client);

        transaction.commit();
        session.close();
    }


    public Client getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = session.get(Client.class, id);

        transaction.commit();
        session.close();

        return client;
    }
    public void update(Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(client);

        transaction.commit();
        session.close();
    }

    public void delete(Client client) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(client);

        transaction.commit();
        session.close();
    }

    public Client getByPhone(Long phone) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNativeQuery(
                "SELECT * FROM clients WHERE phone = :phone",
                Client.class
        );
        query.setParameter("phone", phone);
        Client clientResult = (Client) query.getSingleResult();

        transaction.commit();
        session.close();

        return clientResult;
    }


    public List<Client> getAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Client> clients = session.createQuery("from Client").list();
        transaction.commit();
        session.close();

        return clients;
    }
}

