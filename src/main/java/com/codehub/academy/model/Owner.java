package com.codehub.academy.model;

public class Owner {

    private Integer ownerTaxId;

    private String name;

    private String surname;

    public Owner(int ownerTaxId, String name, String surname) {
        this.ownerTaxId = ownerTaxId;
        this.name = name;
        this.surname = surname;
    }

    public Integer getOwnerTaxId() {
        return ownerTaxId;
    }

    public void setOwnerTaxId(Integer ownerTaxId) {
        this.ownerTaxId = ownerTaxId;
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
}
