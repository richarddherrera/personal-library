package com.richarddev.personal_library.model;

import com.richarddev.personal_library.enums.statusLeitura;
import jakarta.persistence.*;
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
    private int anoPublicacao;

    @Column(name = "genre")
    private String genero;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private statusLeitura status;

}
