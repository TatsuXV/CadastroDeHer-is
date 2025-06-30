package dev.java.CadastroDeHeros.heros;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    private HerosRepository herosRepository;

    public HeroService(HerosRepository herosRepository) {
        this.herosRepository = herosRepository;
    }

    public List<HeroModel> listarheroi(){
        return herosRepository.findAll();
    }

    public HeroModel listarHeroPorId(Long id){
        Optional<HeroModel> heroPorId = herosRepository.findById(id);
        return heroPorId.orElse(null);
    }
}
