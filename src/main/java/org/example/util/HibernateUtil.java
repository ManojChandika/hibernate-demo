package org.example.util;

import org.example.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private  static SessionFactory sessionFactory=null;
    public static SessionFactory getSessionFactory(){
        try{
            if (sessionFactory==null){
                // Create Configuration
                Configuration configuration= new Configuration();
                configuration.configure();
                configuration.addAnnotatedClass(User.class);

                // Initialize the Session Object
                sessionFactory=configuration.buildSessionFactory();
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Session factory Object not created of the some issue");
        }
        return sessionFactory;
    }
}


