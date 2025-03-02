package com.example.demo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(length = 100)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> feature;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Account getAccount() {
        return account;
    }
    
    public Card getCard() {
        return card;
    }
    
    public List<Feature> getFeature() {
        return feature;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public List<News> getNews() {
        return news;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setFeature(List<Feature> feature) {
        this.feature = feature;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
    
}
