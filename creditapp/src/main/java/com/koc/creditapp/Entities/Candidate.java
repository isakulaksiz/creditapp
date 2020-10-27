package com.koc.creditapp.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Candidate {

    @Id
    @GeneratedValue
    public Integer id;

    @GeneratedValue(name="IDENTITY_NO")
    private String identityNo;

    @GeneratedValue(name="NAME")
    private String name;

    @GeneratedValue(name="SURNAME")
    private String surname;

    @GeneratedValue(name="INCOME")
    private BigDecimal income;

    @GeneratedValue(name="LIMIT")
    private BigDecimal limit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
