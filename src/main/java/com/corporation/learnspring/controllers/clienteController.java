package com.corporation.learnspring.controllers;

import com.corporation.learnspring.entities.Cliente;
import com.corporation.learnspring.repositories.clienteOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class clienteController {
    @Autowired
    clienteOperations clienteRepo;

    @GetMapping
    public List<Cliente> findAll() {
        return clienteRepo.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Cliente> obtenerPorId(@PathVariable Long id) {
        return clienteRepo.findById(id);
    }
    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente renovar(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteRepo.save(cliente);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        clienteRepo.deleteById(id);
    }
}
