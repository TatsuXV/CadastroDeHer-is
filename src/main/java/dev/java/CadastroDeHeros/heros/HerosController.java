package dev.java.CadastroDeHeros.heros;

import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
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
    public HeroModel criarHero(@RequestBody HeroModel heroi){
        return heroserv.criarHeroi(heroi);
    }

    //Mostrar todos os heróis (READ)
    @GetMapping("/todos")
    public List<HeroModel> listarHeroi(){
        return heroserv.listarheroi();
    }

    //Mostrar Herói por ID (READ)
    @GetMapping("/todos/{ID}")
    public HeroModel mostrarTodosOsHeróiID(@PathVariable Long Id){
        return heroserv.listarHeroPorId(Id);
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
