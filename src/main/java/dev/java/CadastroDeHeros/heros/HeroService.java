package dev.java.CadastroDeHeros.heros;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HeroService {

    private HerosRepository herosRepository;
    private HeroMapper heroMapper;

    public HeroService(HerosRepository herosRepository, HeroMapper heroMapper) {
        this.herosRepository = herosRepository;
        this.heroMapper = heroMapper;
    }

    public List<HeroDTO> listarheroi(){
        List <HeroModel> heroi = herosRepository.findAll();
        return heroi.stream()
                .map(heroMapper::map)
                .collect(Collectors.toList());
    }

    public HeroDTO listarHeroPorId(Long id){
        Optional<HeroModel> heroPorId = herosRepository.findById(id);
        return heroPorId.map(heroMapper::map).orElse(null);
    }

    public HeroDTO criarHeroi(HeroDTO heroi){
        HeroModel nome = heroMapper.map(heroi);
        nome = herosRepository.save(nome);
        return heroMapper.map(nome);
    }

    public HeroDTO atualizarHeroi(Long id, HeroDTO heroDTO){
        Optional<HeroModel> heroiExistente = herosRepository.findById(id);
        if (heroiExistente.isPresent()){
            HeroModel heroiAtualizado = heroMapper.map(heroDTO);
            heroiAtualizado.setId(id);
            HeroModel heroiSalvo = herosRepository.save(heroiAtualizado);
            return heroMapper.map(heroiSalvo);
        } return null;
    }

    public void deletarHeroiPorid(Long id){
        herosRepository.deleteById(id);
    }
}
