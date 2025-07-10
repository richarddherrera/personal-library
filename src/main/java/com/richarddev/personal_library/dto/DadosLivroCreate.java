package com.richarddev.personal_library.dto;

import com.richarddev.personal_library.enums.generoLivro;
import com.richarddev.personal_library.enums.statusLeitura;
import jakarta.validation.constraints.*;

import java.time.Year;


public record DadosLivroCreate(



        @NotBlank(message = "O campo título nao pode ser vazio!")
        @Size(min = 3, max = 50, message = "O campo título deve ter entre {min} e {max} caractéres!")
        String titulo,


        @NotBlank(message = "O campo autor nao pode ser vazio!")
        @Size(min = 3, max = 50, message = "O campo autor deve ter entre {min} e {max} caractéres!")
        String autor,


        @NotNull(message = "O campo Ano de Publicacao nao pode ser vazio")
        @Min(value = 1440)
        Integer anoPublicacao,



        @NotBlank(message = "O campo gênero nao pode ser vazio")
        generoLivro genero,



        @NotBlank(message = "O campo status nao pode ser vazio")
        statusLeitura status)
{

        @AssertTrue(message = "O ano de publicação não pode ser maior que o ano atual")
        public boolean isAnoValido(){
                return anoPublicacao <= Year.now().getValue(); // Se essa condição for verdadeira, o dado passou na validação! Se não chama a mensagem do @AssertTrue
        }

}
