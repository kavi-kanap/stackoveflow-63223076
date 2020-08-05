package com.custom;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    Long id;

    String name;

    public Car(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
