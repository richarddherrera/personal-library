package com.richarddev.personal_library.repository;

import com.richarddev.personal_library.enums.generoLivro;
import com.richarddev.personal_library.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository <Livro, Long> {
    
    List<Livro> findByGenero (generoLivro genero);

    Optional<Livro> findByTitulo (String titulo);
}
