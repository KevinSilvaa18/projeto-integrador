package com.example.projetointegrador.dto;

import com.example.projetointegrador.models.Curso;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.projetointegrador.models.Laboratorio;

import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDTO {
    private LocalDate horaLocal;
    private String nomeAgendamentos;
    private Laboratorio laboratorio;
    private Curso curso;
    private Integer numeroLaboratorio;
    private String horaInicial;
    private String horaFinal;
}
