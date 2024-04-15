package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();


        User sami = new User("Sami", "Uraimjanova", (byte) 16);
        User rabi = new User("Rabi", "Buzurmanalieva", (byte) 17);
        userDaoHibernate.saveUser(sami.getName(), sami.getLastName(), sami.getAge());
        userDaoHibernate.saveUser(rabi.getName(), rabi.getLastName(), rabi.getAge());

        System.out.println(userDaoHibernate.getAllUsers());

    }
}
