package com.ola.myCar.InstitutionMaintenance.service;

import com.ola.myCar.InstitutionMaintenance.dao.InstitutionDAO;
import com.ola.myCar.InstitutionMaintenance.entity.InstitutionEntity;
import com.ola.myCar.InstitutionMaintenance.model.InstitutionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    private InstitutionDAO institutionDAO;

    @Override
    public List<
            InstitutionTO> getAllInstitutions(){
        return institutionDAO.findAll().stream().map(this::mapToInstitutionTO).collect(Collectors.toList());

    }
    private InstitutionTO mapToInstitutionTO(InstitutionEntity institutionEntity){
        return new InstitutionTO(institutionEntity.getAdress(),institutionEntity.getEmail(), institutionEntity.getPhoneNr());
    }


}
