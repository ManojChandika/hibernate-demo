package org.example;

import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class SaveApp {
    public static void main(String[] args) {

        SessionFactory sessionfactory = HibernateUtil.getSessionFactory();

        if (sessionfactory!=null) {

            //Initialize the Objects
            Session session = sessionfactory.openSession();

            User user= new User("Manoj Chandika","manojmpmc@gmail.com");


            // transaction create the query
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            // session.detach(person);
            session.close();
//            System.out.println("Does session Object managed by session -"+session.contains(person));

        }

    }

}