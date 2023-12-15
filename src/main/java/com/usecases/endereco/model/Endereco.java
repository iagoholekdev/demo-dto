package com.usecases.endereco.model;

import com.usecases.bairro.model.Bairro;
import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "endereco")
@SequenceGenerator(name = "endereco_sequence", sequenceName = "endereco_sequence", allocationSize = 1)
@Builder
@Getter
@Setter
public class Endereco {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    private Long id;

    @Column(name = "rua")
    private String rua;

    @ManyToOne
    @JoinColumn(name = "bairroid")
    private Bairro bairro;

}
