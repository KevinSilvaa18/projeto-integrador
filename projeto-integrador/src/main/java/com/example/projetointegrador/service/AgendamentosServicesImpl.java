package com.example.projetointegrador.service;

import com.example.projetointegrador.models.Agendamentos;
import org.springframework.stereotype.Service;
import com.example.projetointegrador.repositories.AgendamentosRepository;

import java.util.List;

@Service
public class AgendamentosServicesImpl implements AgendamentosServices{

   final AgendamentosRepository agendamentosRepository;

    public AgendamentosServicesImpl(AgendamentosRepository agendamentosRepository) {
        this.agendamentosRepository = agendamentosRepository;
    }

    @Override
    public Agendamentos salvar(Agendamentos agendamentos) throws Exception {

        String[] horaInicio = agendamentos.getHoraInicial().split(":");
        String[] horaFinal =  agendamentos.getHoraFinal().split(":");

        Integer horarioInicio = Integer.parseInt(horaInicio[0]);

        Integer horarioFim = Integer.parseInt(horaFinal[0]);

        if(agendamentos.getDataFinal().isBefore(agendamentos.getDataInicio()) ) {
            throw new Exception("Não é possivel realizar um agendamento com a data de termino menor que a data de inicio");
        }

        if(horarioFim < horarioInicio) {
            throw new Exception("Não é possivel realizar um agendamento com o horario final menor que o horario de inicio");
        }

        if (agendamentos.getHoraInicial().equals(agendamentos.getHoraFinal())) {
            throw new Exception("Não é possivel salvar um agendamento com a hora de inicio igual a hora de termino");
        }
        return agendamentosRepository.save(agendamentos);
    }

    @Override
    public Agendamentos editar(Agendamentos agendamentos) {
        return null;
    }

    @Override
    public List<Agendamentos> listar() {
        return agendamentosRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        agendamentosRepository.deleteById(id);
    }


}
