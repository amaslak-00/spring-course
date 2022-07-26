package com.ola.myCar.InstitutionMaintenance.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InstitutionEntity {


    @Id
    private Long id;
    private String adress;
    private String email;
    private int phoneNr;

    public InstitutionEntity(Long id, String adress, String email, int phoneNr) {
        this.id = id;
        this.adress = adress;
        this.email = email;
        this.phoneNr = phoneNr;
    }

    protected InstitutionEntity(){

    }

    public Long getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNr() {
        return phoneNr;
    }
}
