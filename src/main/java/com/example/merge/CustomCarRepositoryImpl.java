package com.example.merge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

public class CustomCarRepositoryImpl implements CustomCarRepository {

    @Autowired
    EntityManager em;

    @Transactional
    public Car loadWheelsForCar(Car car){
        Car merged = em.merge(car);
        merged.getWheels().size();
        return merged;
    }
}
