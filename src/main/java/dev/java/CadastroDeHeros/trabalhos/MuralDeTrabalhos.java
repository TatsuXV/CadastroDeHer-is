package dev.java.CadastroDeHeros.trabalhos;

import dev.java.CadastroDeHeros.heros.HeroModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_Jobs")
public class MuralDeTrabalhos {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String trabalho;

    private String dificuldade;

    @OneToMany(mappedBy = "trabalhos" )
    private List<HeroModel> hero;
}
