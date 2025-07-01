package com.corporation.learnspring.repositories;

import com.corporation.learnspring.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clienteOperations extends JpaRepository<Cliente, Long> {}
