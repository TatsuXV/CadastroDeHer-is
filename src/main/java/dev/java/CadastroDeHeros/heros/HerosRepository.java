package dev.java.CadastroDeHeros.heros;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HerosRepository extends JpaRepository<HeroModel , Long> {
}
