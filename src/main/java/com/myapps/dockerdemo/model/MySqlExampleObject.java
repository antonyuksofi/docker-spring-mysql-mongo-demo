package com.myapps.dockerdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "exampleobject")
public class MySqlExampleObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MySqlExampleObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
