package dev.java.CadastroDeHeros.heros;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/heros")
@RestController
public class HerosController {

    private HeroService heroserv;

    public HerosController(HeroService heroservice) {
        this.heroserv = heroservice;
    }

    @GetMapping("bem-vindo")
    public String boasVindas(){
        return "Essa é a minha primeira menssagem";
    }

    //Criar heroi (CREATE)
    @PostMapping("/criar")
    public String criarHeroi(){
        return "Heróicriado";
    }

    //Mostrar todos os heróis (READ)
    @GetMapping("/todos")
    public List<HeroModel> listarHeroi(){
        return heroserv.listarheroi();
    }

    //Mostrar Herói por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsHeróiID(){
        return "Mostrar Herói por ID";
    }

    //Alterar Dados dos Heróis (UPDATE)
    @PutMapping("/alterarID")
    public String alterarHeróiPorID(){
        return "Alterar Herói por id";
    }

    //Excluir Herói(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarHeróiPorID(){
        return "Deletar Herói por ID";
    }



}
