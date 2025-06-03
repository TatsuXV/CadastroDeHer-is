package dev.java.CadastroDeHeros.heros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class HerosController {

    @GetMapping("bem-vindo")
    public String boasVindas(){
        return "Essa é a minha primeira menssagem";
    }
}
