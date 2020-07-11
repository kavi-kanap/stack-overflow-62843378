package com.example.merge;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "wheels")
public class Wheel {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    private Car ownerCar;


    private Wheel() {
    }

    public Wheel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Car getOwnerCar() {
        return ownerCar;
    }

    public void setOwnerCar(Car ownerCar) {
        this.ownerCar = ownerCar;
    }

    public String getName() {
        return name;
    }
}
