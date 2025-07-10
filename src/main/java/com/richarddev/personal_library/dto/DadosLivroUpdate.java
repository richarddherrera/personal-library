package com.richarddev.personal_library.dto;

import com.richarddev.personal_library.enums.statusLeitura;
import jakarta.validation.constraints.NotNull;

public record DadosLivroUpdate(

        @NotNull Long id,
        statusLeitura status) {
}
