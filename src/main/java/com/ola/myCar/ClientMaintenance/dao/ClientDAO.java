package com.ola.myCar.ClientMaintenance.dao;

import com.ola.myCar.ClientMaintenance.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<ClientEntity, Long> {

}
