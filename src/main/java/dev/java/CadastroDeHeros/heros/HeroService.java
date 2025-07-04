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

    public HeroModel criarHeroi(HeroModel heroi){
        return herosRepository.save(heroi);
    }

    public HeroModel atualizarHeroi(Long id, HeroModel heroAtualizar){
        if(herosRepository.existsById(id)){
            heroAtualizar.setId(id);
            return herosRepository.save(heroAtualizar);
        }return null;
    }

    public void deletarHeroiPorid(Long id){
        herosRepository.deleteById(id);
    }
}
