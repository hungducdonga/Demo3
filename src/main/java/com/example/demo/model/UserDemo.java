package com.example.demo.model;

import jakarta.persistence.*;

@Table(name = "USER_DEMO")
@Entity
public class UserDemo {
    @Id
    @Column

    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
}
