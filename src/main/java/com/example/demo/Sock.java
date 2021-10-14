package com.example.demo;

import jdk.dynalink.Operation;

import javax.persistence.*;

@Entity
@Table(name = "sock")

public class Sock {
    @Id
    @SequenceGenerator(
            name = "sock_sequence",
            sequenceName = "sock_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sock_sequence"
    )


    private Long id;
    private String color;
    private Integer operation;
    private Integer cottonPart;

    public Sock() {
    }

    public Sock(Long id, String color, Integer operation, Integer cottonPart) {
        this.id = id;
        this.color = color;
        this.operation = operation;
        this.cottonPart = cottonPart;
    }

    public Sock(String color, Integer operation, Integer cottonPart) {
        this.color = color;
        this.operation = operation;
        this.cottonPart = cottonPart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Integer getCottonPart() {
        return cottonPart;
    }

    public void setCottonPart(Integer cottonPart) {
        this.cottonPart = cottonPart;
    }
}


