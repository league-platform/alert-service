package com.league.alertservice.service;

import com.league.alertservice.model.Alert;
import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@Singleton
public class AlertService {

    private final EntityManager entityManager;

    public AlertService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Alert save(Alert alert) {
        System.out.println("EVENT: alert.created -> " + alert.getMessage());
        entityManager.persist(alert);
        return alert;
    }

    @Transactional
    public List<Alert> findAll() {
        return entityManager.createQuery("FROM Alert", Alert.class).getResultList();
    }
}
