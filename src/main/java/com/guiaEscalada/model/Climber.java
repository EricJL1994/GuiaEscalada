package com.guiaEscalada.model;

import javax.persistence.*;

@Entity
@Table(name = "climbers")
public class Climber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
