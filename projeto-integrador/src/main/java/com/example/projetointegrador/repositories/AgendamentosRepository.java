package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Agendamentos;
import com.example.projetointegrador.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long> {

    List<Agendamentos> findAgendamentosByHoraInicial(String horaInicial);

    List<Agendamentos> findAgendamentosByDataInicio(LocalDate dataInicio);

}
