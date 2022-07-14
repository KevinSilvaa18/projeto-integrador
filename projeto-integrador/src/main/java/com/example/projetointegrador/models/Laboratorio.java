package com.example.projetointegrador.models;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "laboratorio")
@Builder
public class Laboratorio {

    @Id
    @Column(name = "id_laboratorio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantidade")
    private String quantidade;

    @Column(name = "nome")
    private String nome;

    @Column(name = "status")
    private Boolean status;

}
