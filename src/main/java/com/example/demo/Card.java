package com.example.demo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", precision = 11, scale = 2)
    private BigDecimal limit;

    public BigDecimal getLimit() {
        return limit;
    }

    public long getID() {
        return ID;
    }

    public String getNumber() {
        return number;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
