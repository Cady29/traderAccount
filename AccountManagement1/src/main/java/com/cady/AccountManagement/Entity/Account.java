package com.cady.AccountManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  // Use jakarta.persistence.Id for JPA

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {

    @Id  // JPA Id annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Automatically generate primary key
    private long id;  // Use lowercase 'id' instead of 'Id' for convention

    private String userName;
    private double balance;
}
