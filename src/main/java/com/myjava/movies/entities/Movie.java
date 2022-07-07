package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    public Long getId2() {
        return id2;
    }

    public void setId2(Long id2) {
        this.id2 = id2;
    }

    public Movie() {
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
