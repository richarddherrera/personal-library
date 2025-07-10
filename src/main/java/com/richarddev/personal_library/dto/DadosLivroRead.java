package com.richarddev.personal_library.dto;

import com.richarddev.personal_library.enums.generoLivro;
import com.richarddev.personal_library.enums.statusLeitura;
import com.richarddev.personal_library.model.Livro;
import jakarta.validation.constraints.NotNull;

public record DadosLivroRead(

        @NotNull Long id,
        String titulo,
        String autor,
        Integer anoPulicacao,
        generoLivro genero,
        statusLeitura status) {

    public DadosLivroRead (Livro livro){
        this(
                livro.getId(),
                livro.getTitulo(),
                livro.getAutor(),
                livro.getAnoPublicacao(),
                livro.getGenero(),
                livro.getStatus());
    }
}
