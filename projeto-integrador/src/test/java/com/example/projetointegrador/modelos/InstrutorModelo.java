package com.example.projetointegrador.modelos;

import com.example.projetointegrador.models.Instrutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InstrutorModelo {
    public static Instrutor construirCenario() {
        Instrutor instrutor;

        instrutor = Instrutor.builder()
                .id(1l)
                .email("teste@gmail.com")
                .nome("teste")
                .senha("q123123")
                .build();

        return instrutor;
    }
}
