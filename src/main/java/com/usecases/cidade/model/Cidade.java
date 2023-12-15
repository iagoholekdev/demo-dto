package com.usecases.cidade.model;

import com.usecases.estado.model.Estado;
import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@SequenceGenerator(name = "cidade_sequence", sequenceName = "cidade_sequence", allocationSize = 1)
@Builder
@Getter
@Setter
public class Cidade {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "estadoid")
    private Estado estado;


}
