package dev.java.CadastroDeHeros.heros;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java.CadastroDeHeros.trabalhos.MuralDeTrabalhos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class HeroModel {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "rank")
    private String rank;

    @Column(name = "imagem")
    private String iMG_url;

    @ManyToOne
    @JoinColumn(name = "trabalho_id")
    @JsonIgnore
    private MuralDeTrabalhos job;
}
