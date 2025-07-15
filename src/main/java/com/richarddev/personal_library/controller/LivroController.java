package com.richarddev.personal_library.controller;

import com.richarddev.personal_library.dto.DadosLivroCreate;
import com.richarddev.personal_library.model.Livro;
import com.richarddev.personal_library.repository.LivroRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    @PostMapping
    @Transactional
    public void cadastroLivro (@RequestBody @Valid DadosLivroCreate dados){
        livroRepository.save(new Livro(dados));
    }
}
