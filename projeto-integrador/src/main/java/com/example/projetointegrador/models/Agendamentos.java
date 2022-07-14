package com.example.projetointegrador.models;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
@Table(name = "agendamento")
@Builder
public class Agendamentos {

    @Id
    @Column(name = "id_agendamentos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "agendamentos_instrutor",
            joinColumns = @JoinColumn(name = "id_instrutor"),
            inverseJoinColumns = @JoinColumn(name = "id_agendamentos"))
    private Instrutor instrutor;

    @ManyToOne(cascade ={ CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch =  FetchType.LAZY)
    @JoinTable(name = "agendamentos_laboratorio",
            joinColumns = @JoinColumn(name = "id_laboratorio"),
            inverseJoinColumns = @JoinColumn(name = "id_agendamentos"))
    private Laboratorio laboratorio;

    @ManyToOne(cascade ={ CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch =  FetchType.LAZY)
    @JoinTable(name = "agendamento_curso",
            joinColumns = @JoinColumn(name = "id_curso"),
            inverseJoinColumns = @JoinColumn(name = "id_agendamentos"))
    private Curso curso;

    @Column(name = "numeroLaboratorio")
    private Integer numeroLaboratorio;

    @Column(name = "horaInicial")
    private String horaInicial;

    @Column(name = "horaFinal")
    private String horaFinal;

    @Column(name = "dataInicio")
    private LocalDate dataInicio;

    @Column(name = "dataFinal")
    private LocalDate dataFinal;

}
