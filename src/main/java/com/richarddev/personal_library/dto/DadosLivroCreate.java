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

        @NotNull(message = "O campo gênero nao pode ser vazio")
        generoLivro genero,

        @NotNull(message = "O campo status nao pode ser vazio")
        statusLeitura status )
{

        @AssertTrue(message = "O ano de publicação não pode ser maior que o ano atual!")
        public boolean isAnoValido() {
                if (anoPublicacao == null) return true; // ou false, se preferir forçar que esse campo seja sempre válido
                return anoPublicacao <= Year.now().getValue();
        }


}
