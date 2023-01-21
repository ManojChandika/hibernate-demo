package org.example;


import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ReadApp {
    public static void main(String[] args) {

        SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
        if (sessionfactory!=null) {

            //Initialize the Objects
            Session session = sessionfactory.openSession();

            //User person = session.get(User.class,6);
            User person = session.load(User.class, 1);
            System.out.println(person.getName());
        }

    }
}
