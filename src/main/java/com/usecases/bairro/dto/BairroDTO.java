package com.usecases.bairro.dto;

import com.usecases.cidade.dto.CidadeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BairroDTO {

    private Long id;
    private String nome;
    private CidadeDTO cidadeDTO;

}
