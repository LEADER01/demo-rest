package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userr {

    @Id
    private int id;
    private String name;

    public Userr () {}

    public Userr(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }
}
