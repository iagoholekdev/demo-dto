package com.usecases.bairro.model;


import com.usecases.cidade.model.Cidade;
import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bairro")
@SequenceGenerator(name = "bairro_sequence", sequenceName = "bairro_sequence", allocationSize = 1)
@Builder
@Getter
@Setter
public class Bairro {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    private Long id;

    @Column(name = "rua")
    private String nomeBairro;

    @ManyToOne
    @JoinColumn(name = "cidadeid")
    private Cidade cidade;
}
