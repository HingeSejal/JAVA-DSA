package com.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        // Load configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // Create SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Create Session
        Session session = factory.openSession();

        // Start Transaction
        Transaction tx = session.beginTransaction();

        // Create User object
        User user = new User("Rahul", "rahul@gmail.com", "Pune");

        // Save data
        session.save(user);

        // Commit transaction
        tx.commit();

        // Close session
        session.close();

        System.out.println("User inserted successfully!");
    }
}
