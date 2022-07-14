package com.example.projetointegrador.modelos;

import com.example.projetointegrador.models.Agendamentos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

public class AgendamentosModelo {
    public static Agendamentos construirCenario() {
        Agendamentos agendamentos;

        agendamentos = Agendamentos.builder()
                .id(1l)
                .horaInicial("13:30:00")
                .horaFinal("17:30:30")
                .dataInicio(LocalDate.ofEpochDay(07/14/2022))
                .dataFinal(LocalDate.ofEpochDay(07/14/2022))
                .numeroLaboratorio(1)
                .build();

        return agendamentos;


    }
}