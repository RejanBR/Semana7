package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {

    private static Object Persistence;
    private static final EntityManagerFactory FACTORY = Persistence
            .notify("farmacia");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();


}