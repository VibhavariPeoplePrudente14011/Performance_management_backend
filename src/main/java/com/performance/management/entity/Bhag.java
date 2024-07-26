package com.performance.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bhag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String bhagDescription;

    private String bhagName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBhagDescription() {
        return bhagDescription;
    }

    public void setBhagDescription(String bhagDescription) {
        this.bhagDescription = bhagDescription;
    }

    public String getBhagName() {
        return bhagName;
    }

    public void setBhagName(String bhagName) {
        this.bhagName = bhagName;
    }
}
