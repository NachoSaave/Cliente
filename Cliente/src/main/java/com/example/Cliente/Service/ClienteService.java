package com.example.Cliente.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cliente.Model.Cliente;
import com.example.Cliente.Repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public List<Cliente> listar(){
        return repo.findAll();
    }

    public Cliente guardar(Cliente c){
        return repo.save(c);
    }
}
