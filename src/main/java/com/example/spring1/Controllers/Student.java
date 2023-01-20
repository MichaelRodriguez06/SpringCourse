package com.example.spring1.Controllers;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

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
    @NotEmpty
    private String name;
    @Column(name = "LASTNAME_STUDENT")
    @NotEmpty
    private String lastname;
    @Column(name = "STREET")
    @NotEmpty
    private String street;
    @Column(name = "PHONE_NUMBER")
    @NotEmpty
    private String numberPhone;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    public Student(String name, String lastname, String street, String numberPhone) {
        this.name = name;
        this.lastname = lastname;
        this.street = street;
        this.numberPhone = numberPhone;
    }

    public Student() {

    }

}
