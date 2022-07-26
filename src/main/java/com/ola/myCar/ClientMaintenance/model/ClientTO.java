package com.ola.myCar.ClientMaintenance.model;

import java.util.Date;

public class ClientTO {

    private long id;
    private String location;
    private Date birthDate;
    private long phoneNr;
    private long cardNr;

    public ClientTO(long id, String location, Date birthDate, long phoneNr, long cardNr) {

        this.id = id;
        this.location = location;
        this.birthDate = birthDate;
        this.phoneNr = phoneNr;
        this.cardNr = cardNr;
    }


    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public long getPhoneNr() {
        return phoneNr;
    }

    public long getCardNr() {
        return cardNr;
    }
}
