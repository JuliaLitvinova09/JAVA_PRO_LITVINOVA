package homework25.dao;

import homework25.model.Account;
import homework25.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class AccountDao {
    public void save(Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(account);

        transaction.commit();
        session.close();
    }

    public Account getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Account account = session.get(Account.class, id);

        transaction.commit();
        session.close();

        return account;
    }

    public void update(Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(account);

        transaction.commit();
        session.close();
    }

    public void delete(Account account) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(account);

        transaction.commit();
        session.close();
    }

    public List<Account> getAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Account> accountList = session.createQuery("from Account").list();
        transaction.commit();
        session.close();

        return accountList;
    }
}
