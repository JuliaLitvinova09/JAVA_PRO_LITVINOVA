package homework26.util;

import homework26.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Properties properties = new Properties();
                Configuration configuration = new Configuration().addProperties(properties);
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Chain.class);
                configuration.addAnnotatedClass(Account.class);
                configuration.addAnnotatedClass(Book.class);
                configuration.addAnnotatedClass(ClientBookLike.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }
}

