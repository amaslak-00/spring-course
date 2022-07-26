package com.ola.myCar.ClientMaintenance.service;

import com.ola.myCar.ClientMaintenance.entity.ClientEntity;
import com.ola.myCar.ClientMaintenance.model.ClientTO;

import java.util.List;

public interface ClientService {

    List<ClientTO> getAllClients();
    ClientTO findClientById(Long id) throws Exception;

    void deleteClient(long id);
    ClientEntity addClientToDB(ClientTO clientTO);

    ClientEntity updateClientDB(Long id, ClientTO clientTO);
}
