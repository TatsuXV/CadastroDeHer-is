package dev.java.CadastroDeHeros.heros;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    private HerosRepository herosRepository;

    public HeroService(HerosRepository herosRepository) {
        this.herosRepository = herosRepository;
    }

    public List<HeroModel> listarheroi(){
        return herosRepository.findAll();
    }
}
