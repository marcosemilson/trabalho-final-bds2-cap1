package com.trabalhofinal.client.repositories;

import com.trabalhofinal.client.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
