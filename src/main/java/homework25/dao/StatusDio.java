package homework25.dao;

import homework25.model.Status;
import homework25.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;


public class StatusDio {
    public void save(Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(status);

        transaction.commit();
        session.close();
    }

    public Status getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();

        return status;
    }

    public void update(Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(status);

        transaction.commit();
        session.close();
    }

    public void delete(Status status) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(status);

        transaction.commit();
        session.close();
    }

    public List<Status> getAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Status> statusList = session.createQuery("from Status ").list();
        transaction.commit();
        session.close();

        return statusList;
    }
}

