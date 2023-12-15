package com.usecases.pessoa.model;


import com.usecases.endereco.model.Endereco;
import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
@SequenceGenerator(name = "pessoa_sequence", sequenceName = "pessoa_sequence", allocationSize = 1)
@Builder
@Getter
@Setter
public class Pessoa {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "cpf")
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "enderecoid")
    private Endereco endereco;

}
