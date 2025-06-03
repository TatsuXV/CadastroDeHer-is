package dev.java.CadastroDeHeros.heros;

import dev.java.CadastroDeHeros.trabalhos.MuralDeTrabalhos;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class HeroModel {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToMany
    @JoinColumn(name = "trabalho_id")
    private MuralDeTrabalhos job;

    public HeroModel(){}

    public HeroModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
