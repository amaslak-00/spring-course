package com.ola.myCar.WorkerMaintenance.service;


import com.ola.myCar.WorkerMaintenance.dao.WorkerDAO;
import com.ola.myCar.WorkerMaintenance.entity.WorkerEntity;
import com.ola.myCar.WorkerMaintenance.model.WorkerTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerServiceImpl implements WorkerService{

    @Autowired
    private WorkerDAO workerDAO;

    @Override
    public List<WorkerTO> getAllWorkers(){
        return workerDAO.findAll().stream().map(this::mapToWorkerTO).collect(Collectors.toList());

    }

    private WorkerTO mapToWorkerTO(WorkerEntity workerEntity){
        return new WorkerTO(workerEntity.getId(),
                workerEntity.getLocation(),
                workerEntity.getBirthDate(),
                workerEntity.getPhoneNr(),
                workerEntity.getCardNr());
    }
}
