package com.example.Cliente.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Cliente.Model.Cliente;
import com.example.Cliente.Service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService serv;

    @GetMapping
    public List<Cliente> listar(){
        return serv.listar();
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente c){
        return serv.guardar(c);
    }
}
