package com.example.projetointegrador.service;

import com.example.projetointegrador.models.Curso;
import com.example.projetointegrador.models.Instrutor;
import com.example.projetointegrador.repositories.InstrutorRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class InstrutorServiceImpl implements InstrutorService {

    final InstrutorRepository instrutorRepository;

    public InstrutorServiceImpl(InstrutorRepository instrutorRepository) {
        this.instrutorRepository = instrutorRepository;
    }

    @Override
    public Instrutor salvar(Instrutor instrutor) throws Exception {
        Instrutor emailInstrutor = instrutorRepository.findByEmailInstrutor(instrutor.getEmail());

        if (emailInstrutor != null) {
            throw new EntityNotFoundException("Email já cadastrado");
        } else {
            return instrutorRepository.save(instrutor);
        }
    }
    @Override
    public Instrutor editar(Instrutor instrutor) {
        return null;
    }

    @Override
    public List<Instrutor> listar() {
        return instrutorRepository.findAll();
    }

    @Override
    public Instrutor buscarInstrutorPorEmail(Instrutor instrutor) throws Exception {

        Instrutor instrutor1 = instrutorRepository.findByEmailInstrutor(instrutor.getEmail());

        if(instrutor1 !=null && instrutor.getEmail().equals(instrutor.getEmail()) && instrutor1.getSenha().equals(instrutor.getSenha())) {
            return instrutor1;
        }
        throw new Exception("Email ou senha incorreto");
    }
}
