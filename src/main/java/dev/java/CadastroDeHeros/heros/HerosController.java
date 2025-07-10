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
    public HeroDTO criarHero(@RequestBody HeroDTO heroi){
        return heroserv.criarHeroi(heroi);
    }

    //Mostrar todos os heróis (READ)
    @GetMapping("/todos")
    public List<HeroDTO> listarHeroi(){
        return heroserv.listarheroi();
    }

    //Mostrar Herói por ID (READ)
    @GetMapping("/todos/{ID}")
    public HeroDTO mostrarTodosOsHeróiID(@PathVariable Long Id){
        return heroserv.listarHeroPorId(Id);
    }

    //Alterar Dados dos Heróis (UPDATE)
    @PutMapping("/alterar/{id}")
    public HeroDTO atualizarheroi(@PathVariable Long id, @RequestBody HeroDTO ninjaAtualizado){
        return heroserv.atualizarHeroi(id, ninjaAtualizado);
    }

    //Excluir Herói(DELETE)
    @DeleteMapping("/deletar/{ID}")
    public void deletarHeróiPorID(@PathVariable Long id){
        heroserv.deletarHeroiPorid(id);
    }



}
