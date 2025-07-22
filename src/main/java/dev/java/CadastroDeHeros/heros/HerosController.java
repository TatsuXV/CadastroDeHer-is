package dev.java.CadastroDeHeros.heros;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity <String> criarHero(@RequestBody HeroDTO heroi){
        HeroDTO herocriado = heroserv.criarHeroi(heroi);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Heroi criado com sucesso: " + herocriado.getNome() + " Id: " + herocriado.getId());
    }

    //Mostrar todos os heróis (READ)
    @GetMapping("/todos")
    public List<HeroDTO> listarHeroi(){
        return heroserv.listarheroi();
    }

    //Mostrar Herói por ID (READ)
    @GetMapping("/todos/{ID}")
    public ResponseEntity<?> mostrarTodosOsHeróiID(@PathVariable Long Id){
        HeroDTO heroi = heroserv.listarHeroPorId(Id);
        if (heroi != null){
            return ResponseEntity.ok(heroi);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("o heroi do id: "+ Id + " não existe");
        }
    }

    //Alterar Dados dos Heróis (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> atualizarheroi(@PathVariable Long id, @RequestBody HeroDTO ninjaAtualizado){
        HeroDTO heroi = heroserv.atualizarHeroi(id, ninjaAtualizado);

        if (heroi != null){
            return ResponseEntity.ok(heroi);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Não encontramos o id: "+id+" nos nossos registros");
        }
    }

    //Excluir Herói(DELETE)
    @DeleteMapping("/deletar/{ID}")
    public ResponseEntity<String> deletarHeróiPorID(@PathVariable Long id){
        if (heroserv.listarHeroPorId(id) != null){
            heroserv.deletarHeroiPorid(id);
            return ResponseEntity.ok("voce apagou o id: "+id+" com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O heroi nao foi encontrado para deletar");
        }
    }



}
