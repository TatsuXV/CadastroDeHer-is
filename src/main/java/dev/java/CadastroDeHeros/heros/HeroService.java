package dev.java.CadastroDeHeros.heros;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    private HerosRepository herosRepository;
    private HeroMapper heroMapper;

    public HeroService(HerosRepository herosRepository, HeroMapper heroMapper) {
        this.herosRepository = herosRepository;
        this.heroMapper = heroMapper;
    }

    public List<HeroModel> listarheroi(){
        return herosRepository.findAll();
    }

    public HeroModel listarHeroPorId(Long id){
        Optional<HeroModel> heroPorId = herosRepository.findById(id);
        return heroPorId.orElse(null);
    }

    public HeroDTO criarHeroi(HeroDTO heroi){
        HeroModel nome = heroMapper.map(heroi);
        nome = herosRepository.save(nome);
        return heroMapper.map(nome);
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
