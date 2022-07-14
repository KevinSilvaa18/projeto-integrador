package com.example.projetointegrador.service;

import com.example.projetointegrador.models.Curso;
import org.springframework.stereotype.Service;
import com.example.projetointegrador.repositories.CursoRepository;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }


    @Override
    public Curso salvar(Curso curso) throws Exception {

        List<Curso> listaDeCursos = cursoRepository.findCursoByNome(curso.getNome());

        if (listaDeCursos != null && listaDeCursos.size() > 0){
            throw new Exception("O curso" + curso.getNome() + "já foi cadastrado" );
        }

        return cursoRepository.save(curso);
    }

    @Override
    public Curso editar(Curso curso) {
        return null;
    }

    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }
}
