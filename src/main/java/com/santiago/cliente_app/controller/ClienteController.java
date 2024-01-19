package com.santiago.cliente_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.santiago.cliente_app.model.Cliente;
import com.santiago.cliente_app.repository.ClienteRepository;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  public ClienteController(ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  @GetMapping
  public List<Cliente> listar() {
    return clienteRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Cliente criarCliente(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
  }

}
