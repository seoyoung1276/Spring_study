package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "table_demo")
@Entity
public class Demo {

    @Id
    @GeneratedValue
    private Long id;

    private String demoText;

}
