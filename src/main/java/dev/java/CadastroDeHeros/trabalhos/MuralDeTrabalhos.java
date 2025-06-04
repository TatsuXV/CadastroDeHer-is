package dev.java.CadastroDeHeros.trabalhos;

import dev.java.CadastroDeHeros.heros.HeroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_Jobs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MuralDeTrabalhos {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String trabalho;
    private String dificuldade;

    @OneToMany(mappedBy = "trabalhos" )
    private List<HeroModel> hero;
}
