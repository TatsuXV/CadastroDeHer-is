package dev.java.CadastroDeHeros.heros;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java.CadastroDeHeros.trabalhos.MuralDeTrabalhos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private long id;
    private String nome;
    private String email;
    private int idade;
    private String rank;
    private String iMG_url;
    private MuralDeTrabalhos job;
}
