package com.example.spring1.Controllers;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "students")
public class Student implements Serializable {

    public static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STUDENT", nullable = false, unique = true)
    private long id;
    @Column(name = "NAME_STUDENT")
    private String name;
    @Column(name = "LASTNAME_STUDENT")
    private String lastname;
    @Column(name = "STREET")
    private String street;
    @Column(name = "PHONE_NUMBER")
    private String numberPhone;

    public Student(String name, String lastname, String street, String numberPhone) {
        this.name = name;
        this.lastname = lastname;
        this.street = street;
        this.numberPhone = numberPhone;
    }

    public Student() {

    }

}
