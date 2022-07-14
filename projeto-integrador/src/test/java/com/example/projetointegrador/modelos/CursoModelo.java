package com.example.projetointegrador.modelos;

import com.example.projetointegrador.models.Curso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CursoModelo {
    public static Curso construirCenario() {
        Curso curso;

        curso = Curso.builder()
                .id(1l)
                .nome("Programação")
                .quantidadeAluno(22)
                .build();

        return curso;

    }
}