package com.example.projetointegrador.controllers;

import com.example.projetointegrador.service.CursoServiceImpl;
import com.example.projetointegrador.models.Curso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {
    final CursoServiceImpl cursoService;

    public CursoController(CursoServiceImpl cursoService) {
        this.cursoService = cursoService;
    }


    @PostMapping
    public ResponseEntity<Curso> salvarCurso(@RequestBody Curso curso) throws Exception {
        Curso response = cursoService.salvar(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping()
    public void deleteCurso(Long id) {
        cursoService.delete(id);
    }

    @GetMapping
    public List<Curso> buscarCurso() {
        return cursoService.listar();
    }

    @PutMapping
    public void atualizarCurso(@RequestBody Curso curso) {
        cursoService.editar(curso);
    }
}