package com.usecases.estado.model;

import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "estado")
@SequenceGenerator(name = "estado_sequence", sequenceName = "estado_sequence", allocationSize = 1)
@Builder
@Getter
@Setter
public class Estado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_sequence")
    private Long id;

    @Column(name = "nome")
    private String nome;


}
