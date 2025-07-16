package com.richarddev.personal_library.model;

import com.richarddev.personal_library.dto.DadosLivroCreate;
import com.richarddev.personal_library.dto.DadosLivroUpdate;
import com.richarddev.personal_library.enums.generoLivro;
import com.richarddev.personal_library.enums.statusLeitura;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Entity(name = "livro")
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String titulo;

    @Column(name = "author")
    private String autor;

    @Column(name = "publication_year")
    private Integer anoPublicacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private generoLivro genero;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private statusLeitura status;

    public Livro (DadosLivroCreate dados){
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.anoPublicacao = dados.anoPublicacao();
        this.genero = dados.genero();
        this.status = dados.status();
    }

    public void atualizarStatusLivro (DadosLivroUpdate dados){
        if (dados.status() != null){
            this.status = dados.status();
        }

    }

}
