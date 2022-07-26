package com.ola.myCar.WorkerMaintenance.controller;

import com.ola.myCar.WorkerMaintenance.model.WorkerTO;
import com.ola.myCar.WorkerMaintenance.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping("/workers")
    public List<WorkerTO> getAllWorkers(){
        return workerService.getAllWorkers();
    }
}
