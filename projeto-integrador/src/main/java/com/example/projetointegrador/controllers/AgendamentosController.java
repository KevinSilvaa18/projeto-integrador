package com.example.projetointegrador.controllers;


import com.example.projetointegrador.models.Agendamentos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.projetointegrador.service.AgendamentosServicesImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentosController {
    final AgendamentosServicesImpl agendamentosServices;


    public AgendamentosController(AgendamentosServicesImpl agendamentosServices) {
        this.agendamentosServices = agendamentosServices;
    }


    @PostMapping
    public ResponseEntity<Agendamentos> salvarAgendamentos(@RequestBody Agendamentos agendametos) throws Exception {
        Agendamentos response = agendamentosServices.salvar(agendametos);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping()
    public void deleteAgendamentos(Long id){
        agendamentosServices.delete(id);
    }

    @GetMapping
    public ResponseEntity<Object> buscarAgendamentos(){
        List<Agendamentos> response =  agendamentosServices.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    public void atualizarAgendamentos (@RequestBody Agendamentos agendamentos){
        agendamentosServices.editar(agendamentos);
    }
}

