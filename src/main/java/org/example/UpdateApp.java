package org.example;

import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class UpdateApp {
    public static void main(String[] args) {

        SessionFactory sessionfactory = HibernateUtil.getSessionFactory();

        if (sessionfactory!=null) {
            //Initialize the Objects
            Session session = sessionfactory.openSession();

////        only Email column update others are null
//        User person = new User();
//        person.setId(1);
//        person.setEmail("aaaaaaaa@gmail.com");

            User user = session.get(User.class, 1);
            user.setEmail("mpmcmanoj@gmail.com");

            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
            session.close();
        }

    }
}
