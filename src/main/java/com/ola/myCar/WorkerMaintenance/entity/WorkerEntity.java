package com.ola.myCar.WorkerMaintenance.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class WorkerEntity {


    enum Position{
       salesman,
       manager,
       accountant
    }

    @Id
    private Long id;
    private Position position;
    private String location;
    private Date birthDate;
    private Long phoneNr;
    private Long cardNr;

    public WorkerEntity(Long id, Position position, String location, Date birthDate, Long phoneNr, Long cardNr) {
        this.id = id;
        this.position = position;
        this.location = location;
        this.birthDate = birthDate;
        this.phoneNr = phoneNr;
        this.cardNr = cardNr;
    }

    public Long getId() {
        return id;
    }

    public Position getPosition() {
        return position;
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
