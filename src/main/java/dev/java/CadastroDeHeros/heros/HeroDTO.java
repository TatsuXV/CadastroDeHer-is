package dev.java.CadastroDeHeros.heros;

import dev.java.CadastroDeHeros.trabalhos.MuralDeTrabalhos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroDTO {

    private long id;
    private String nome;
    private String email;
    private int idade;
    private String rank;
    private String iMG_url;
    private MuralDeTrabalhos job;
}
