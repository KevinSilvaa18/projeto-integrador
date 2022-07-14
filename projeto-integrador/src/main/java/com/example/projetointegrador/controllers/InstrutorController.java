package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Instrutor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.projetointegrador.service.InstrutorServiceImpl;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class InstrutorController {

    final InstrutorServiceImpl instrutorService;

    public InstrutorController(InstrutorServiceImpl instrutorService) {
        this.instrutorService = instrutorService;
    }

    @PostMapping
    public ResponseEntity<Instrutor> salvarInstrutor(@RequestBody Instrutor instrutor) throws Exception {
        Instrutor response = instrutorService.salvar(instrutor);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<Instrutor> buscarInstrutor() {
        return instrutorService.listar();
    }

    @PutMapping
    public void atualizarCurso(@RequestBody Instrutor instrutor) {
        instrutorService.editar(instrutor);
    }

    @PostMapping("/v2/login")
public ResponseEntity<Object> sessao(@RequestBody Instrutor instrutor) throws Exception {
    Instrutor response = instrutorService.buscarInstrutorPorEmail(instrutor);
    return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.CREATED);
    }
}