package com.usecases.cidade.dto;

import com.usecases.estado.dto.EstadoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CidadeDTO {

    private Long id;
    private String nome;
    private EstadoDTO estadoDTO;

}
