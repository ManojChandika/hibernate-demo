package org.example;

import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class DeleteApp {
    public static void main(String[] args) {
        SessionFactory sessionfactory = HibernateUtil.getSessionFactory();

        if (sessionfactory!=null) {

            //Initialize the Objects
            Session session = sessionfactory.openSession();

            User person = session.get(User.class, 1);

            session.beginTransaction();
            session.delete(person);
            session.getTransaction().commit();
            session.close();
        }

    }
}
