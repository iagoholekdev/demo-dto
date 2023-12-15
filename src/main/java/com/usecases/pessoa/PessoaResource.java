package com.usecases.pessoa;

import com.usecases.pessoa.dto.PessoaDTO;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Path("/pessoa")
public class PessoaResource {

    @POST
    @Path("/create")
    public void create(PessoaDTO pessoaDTO) {

    }

}
