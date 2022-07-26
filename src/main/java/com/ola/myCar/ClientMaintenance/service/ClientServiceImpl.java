package com.ola.myCar.ClientMaintenance.service;

import com.ola.myCar.ClientMaintenance.dao.ClientDAO;
import com.ola.myCar.ClientMaintenance.entity.ClientEntity;
import com.ola.myCar.ClientMaintenance.model.ClientTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public List<
            ClientTO> getAllClients(){
        return clientDAO.findAll().stream().map(this::mapToClientTO).collect(Collectors.toList());

    }
    private ClientTO mapToClientTO(ClientEntity clientEntity){
        return new ClientTO(
                clientEntity.getId(),
                clientEntity.getLocation(),
                clientEntity.getBirthDate(),
                clientEntity.getPhoneNr(),
                clientEntity.getCardNr());
    }

    private ClientEntity mapToClientEntity(ClientTO clientTO) {
        return new ClientEntity(
                clientTO.getId(),
               clientTO.getLocation(),
                clientTO.getBirthDate(),
                clientTO.getPhoneNr(),
                clientTO.getCardNr());
    }

    @Override
    public ClientTO findClientById(Long id) throws Exception {
        /*Optional - protects us from getting null*/
        Optional<ClientEntity> findClientTO = clientDAO.findById(id);
        if (findClientTO.isPresent())
            return mapToClientTO(findClientTO.get());
        else
            throw new Exception("Client is not in database");

    }

    @Override
    public void deleteClient(long id) {
        Optional<ClientEntity> findClientTO = clientDAO.findById(id);
        if (findClientTO.isPresent()) {
            clientDAO.deleteById(id);
        }
    }
    @Override
    public ClientEntity addClientToDB(ClientTO clientTO) {
        return clientDAO.save(mapToClientEntity(clientTO));
    }

    @Override
    public ClientEntity updateClientDB(Long id, ClientTO clientTO){
        return clientDAO.save(mapToClientEntity(clientTO));
    }


}
