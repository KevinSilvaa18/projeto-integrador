package com.example.projetointegrador.models;

import lombok.*;

import javax.persistence.*;

@Builder()
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Data
@Table(name = "instrutor")
public class Instrutor {

    @Id
    @Column(name = "id_instrutor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;
}
