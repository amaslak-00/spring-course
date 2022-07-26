package com.ola.myCar.InstitutionMaintenance.controller;


import com.ola.myCar.InstitutionMaintenance.model.InstitutionTO;
import com.ola.myCar.InstitutionMaintenance.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstitutionController {

    @Autowired
    private InstitutionService institutionService;

    @RequestMapping("/institutions")
    public List<InstitutionTO> getAllInstitutions(){
        return institutionService.getAllInstitutions();
    }

}
