package com.ola.myCar.ClientMaintenance.controller;

import com.ola.myCar.ClientMaintenance.entity.ClientEntity;
import com.ola.myCar.ClientMaintenance.model.ClientTO;
import com.ola.myCar.ClientMaintenance.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/clients")
    public List<ClientTO> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping("{id}")
    public ClientTO getClientById(@PathVariable("id") long id) throws Exception {
        return clientService.findClientById(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteClientById(@PathVariable("id") long id){
        clientService.deleteClient(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ClientEntity addClient(@RequestBody ClientTO clientTO){
        return clientService.addClientToDB(clientTO);
    }

    @PutMapping("{id}")
    public ClientEntity updateClient(@RequestBody ClientTO clientTO, @PathVariable Long id){
        return clientService.updateClientDB(id, clientTO);
    }

}
