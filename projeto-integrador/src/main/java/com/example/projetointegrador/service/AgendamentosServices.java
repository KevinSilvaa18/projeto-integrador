package com.example.projetointegrador.service;

import com.example.projetointegrador.models.Agendamentos;

import java.util.List;


public interface AgendamentosServices {

    Agendamentos salvar(Agendamentos agendamentos) throws Exception;

    Agendamentos editar(Agendamentos agendamentos);

    List<Agendamentos> listar();

    void delete(Long id);
}
