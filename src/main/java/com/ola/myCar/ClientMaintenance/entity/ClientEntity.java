package com.ola.myCar.ClientMaintenance.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clients")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "location")
    private String location;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "phone_nr")
    private Long phoneNr;
    @Column(name = "card_nr")
    private Long cardNr;

    public ClientEntity(long id, String location, Date birthDate, long phoneNr, long cardNr) {
        this.id = id;
        this.location = location;
        this.birthDate = birthDate;
        this.phoneNr = phoneNr;
        this.cardNr = cardNr;
    }
    protected ClientEntity(){

    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Long getPhoneNr() {
        return phoneNr;
    }

    public Long getCardNr() {
        return cardNr;
    }
}
