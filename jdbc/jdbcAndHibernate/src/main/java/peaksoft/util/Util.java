package peaksoft.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.model.User;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    // реализуйте настройку соеденения с БД

    static String URL = "jdbc:postgresql://localhost:5432/postgres";
    static String name = "postgres";
    static String password = "sami";

    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println("ERROR in getSessionFactory method");
        }
        return sessionFactory;
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, name, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
