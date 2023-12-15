package com.usecases.endereco.dto;

import com.usecases.cidade.dto.CidadeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private Long id;
    private String nome;
    private CidadeDTO cidadeDTO;

}
