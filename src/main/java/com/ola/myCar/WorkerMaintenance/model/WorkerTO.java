package com.ola.myCar.WorkerMaintenance.model;

import java.util.Date;

public class WorkerTO {




    enum Position{
        salesman,
        manager,
        accountant
    }



    private String location;
    private Date birthDate;
    private Long phoneNr;
    private Long cardNr;

    public WorkerTO(Long id,  String location, Date birthDate, Long phoneNr, Long cardNr) {


        this.location = location;
        this.birthDate = birthDate;
        this.phoneNr = phoneNr;
        this.cardNr = cardNr;
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
