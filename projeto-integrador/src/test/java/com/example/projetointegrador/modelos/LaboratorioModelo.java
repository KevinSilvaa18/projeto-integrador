package com.example.projetointegrador.modelos;

import com.example.projetointegrador.models.Laboratorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LaboratorioModelo {
    public static Laboratorio construirCenario() {
        Laboratorio laboratorio;

        laboratorio = Laboratorio.builder()
                .id(2l)
                .nome("Programação")
                .quantidade("10")
                .status(true)
                .build();

        return laboratorio;

    }
}
