package com.example.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String icon;
    
    @Column(length = 100)
    private String description;

    public String getDescription() {
        return description;
    }

    public long getID() {
        return ID;
    }

    public String getIcon() {
        return icon;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
