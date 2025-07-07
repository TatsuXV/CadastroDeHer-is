package dev.java.CadastroDeHeros.heros;

import org.springframework.stereotype.Component;

@Component
public class HeroMapper {
    public HeroModel map(HeroDTO heroDTO){
        HeroModel heroModel = new HeroModel();
        heroModel.setId(heroDTO.getId());
        heroModel.setNome(heroDTO.getNome());
        heroModel.setEmail(heroDTO.getEmail());
        heroModel.setIdade(heroDTO.getIdade());
        heroModel.setRank(heroDTO.getRank());
        heroModel.setIMG_url(heroDTO.getIMG_url());
        heroModel.setJob(heroDTO.getJob());
        return heroModel;

    }

    public HeroDTO map (HeroModel heroModel){
        HeroDTO heroDTO = new HeroDTO();
        heroDTO.setNome(heroModel.getNome());
        heroDTO.setEmail(heroModel.getEmail());
        heroDTO.setId(heroModel.getId());
        heroDTO.setRank(heroModel.getRank());
        heroDTO.setIdade(heroModel.getIdade());
        heroDTO.setIMG_url(heroModel.getIMG_url());
        heroDTO.setJob(heroModel.getJob());
        return heroDTO;

    }
}
