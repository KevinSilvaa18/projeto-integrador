package com.example.projetointegrador.controllers;


import com.example.projetointegrador.models.Laboratorio;
import com.example.projetointegrador.service.LaboratorioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/laboratorio")
public class LaboratorioController {
    final LaboratorioServiceImpl laboratorioService;

    public LaboratorioController(LaboratorioServiceImpl laboratorioService) {
        this.laboratorioService = laboratorioService;
    }

    @PostMapping
    public ResponseEntity<Laboratorio> salvarLaboratorio(@RequestBody Laboratorio laboratorio) throws Exception {
        Laboratorio response = laboratorioService.salvar(laboratorio);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping()
    public void deleteLaboratorio(Long id){
        laboratorioService.delete(id);
    }

    @GetMapping
    public List<Laboratorio> buscarLaboratorio() {
        return laboratorioService.listar();
    }

    @PutMapping
    public void atualizarLaboratorio(@RequestBody Laboratorio laboratorio) {
        laboratorioService.editar(laboratorio);
    }
}


