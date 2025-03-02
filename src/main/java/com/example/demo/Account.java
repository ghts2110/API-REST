package com.example.demo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", scale = 13, precision = 2)
    private BigDecimal limit;

    public String getAgency() {
        return agency;
    }
    
    public long getID() {
        return ID;
    }
    
    public BigDecimal getLimit() {
        return limit;
    }    

    public String getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
