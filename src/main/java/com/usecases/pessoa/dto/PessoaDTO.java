package com.usecases.pessoa.dto;


import com.usecases.endereco.dto.EnderecoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long id;
    private String nome;
    private EnderecoDTO enderecoDTO;

}
