package com.richarddev.personal_library.controller;

import com.richarddev.personal_library.dto.DadosLivroCreate;
import com.richarddev.personal_library.dto.DadosLivroRead;
import com.richarddev.personal_library.dto.DadosLivroUpdate;
import com.richarddev.personal_library.model.Livro;
import com.richarddev.personal_library.repository.LivroRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<DadosLivroRead> listar(){
       return livroRepository.findAll()
               .stream()
               .map(DadosLivroRead::new) // converte cada Livro em DadosLivroRead
               .toList();
    }

    @PutMapping
    @Transactional
    public void atualizarLivro (@RequestBody @Valid DadosLivroUpdate dados){
        var livro = livroRepository.getReferenceById(dados.id());
        livro.atualizarStatusLivro(dados);

    }
}
